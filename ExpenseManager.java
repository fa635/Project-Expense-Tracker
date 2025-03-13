import java.util.ArrayList;

public class ExpenseManager {
    
    public ArrayList<Expense> expenses;
    public JsonManager jsonManager;

    public ExpenseManager () {
        this.expenses = new ArrayList<>();
        this.jsonManager = new JsonManager();
    }



    public void addExpense (String description, int amount) {
        Expense expense = new Expense(description, amount);
        this.expenses.add(expense);

        toJson();
    }

    public void deleteExpense (int id) {
        // id - 1 because the index is 0 based but not the id
        expenses.remove(id - 1);
        // decrement each id by 1 after delete
        for (int i = id - 1; i < expenses.size(); i++) {
            expenses.get(i).id = expenses.get(i).id - 1;
        }
        // decrement the globalId
        Expense.globalId -= 1;

        toJson();
    }

    public void updateExpense (int id, String description, int amount) {
        expenses.get(id - 1).description = description;
        expenses.get(id - 1).amount = amount;

        toJson();
    }


    public void listAllExpenses () {
        for (Expense expense : expenses) {
           System.out.println(expense.id + ", " + expense.description + ", " + expense.amount);
        }
    }

    public void sumAllExpenses () {
        int sum = 0;
        for (Expense expense : expenses) {
           sum += expense.amount;
        }
        System.out.println("Total of expences: " + sum);
    }

    public void sumAllExpensesForMonth (int month) {
        int sum = 0;
        for (Expense expense : expenses) {
            if (expense.date.getMonthValue() == month) {
                sum += expense.amount;
            }
        }
        System.out.println("Total of expences of " + month + ": " + sum);
    }

    public void toJson () {
        jsonManager.writeExpensesToJson(expenses);
    }
}
