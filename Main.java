public class Main {
    
    public static void main(String[] args) {

        ExpenseManager expenseList = new ExpenseManager();

        switch (args[0]) {
            case "add":
                expenseList.addExpense(args[1], Double.valueOf(args[2]));
                break;
                
            case "delete":
                expenseList.deleteExpense(Integer.valueOf(args[1]));
                break;
                
            case "update":
                expenseList.updateExpense(Integer.valueOf(args[1]), args[2], Double.valueOf(args[3]));
                break;

            case "all":
                expenseList.listAllExpenses();
                break;
              
            case "summery":
                expenseList.sumAllExpenses();
                break;
               
            case "summeryM":
                expenseList.sumAllExpensesForMonth(Integer.valueOf(args[1]));
                break;
               
            default:
                System.out.println("Usage: java Main <command>");
                break;
        }
        
    }
}
