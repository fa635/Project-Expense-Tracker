public class Main {
    
    public static void main(String[] args) {

        ExpenseManager expenseList = new ExpenseManager();

        expenseList.addExpense("lunch", 10);
        expenseList.addExpense("dinner", 20);
        expenseList.addExpense("units", 15);
        expenseList.listAllExpenses();

        System.out.println("");
        System.out.println("After delete id 2");
        expenseList.deleteExpense(2);
        expenseList.listAllExpenses();

        System.out.println("");
        System.out.println("After update id 1");
        expenseList.updateExpense(1, "cacao", 130);
        expenseList.listAllExpenses();

        System.out.println("");
        System.out.println("sum of expenses");
        expenseList.sumAllExpenses();

        System.out.println("");
        System.out.println("sum of expenses for month that's not there yet");
        expenseList.sumAllExpensesForMonth(5);

    }
}
