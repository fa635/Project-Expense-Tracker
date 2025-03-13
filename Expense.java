import java.time.LocalDate;

public class Expense {
    public static int globalId = 0;
    public int id;
    public String description;
    public int amount;
    public LocalDate date;

    public Expense (String description, int amount) {
        globalId++;
        this.id = globalId;
        this.description = description;
        this.amount = amount;
        this.date = LocalDate.now();
    }

}
