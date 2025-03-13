import java.time.LocalDate;

public class Expense {
    public static int globalId = 0;
    public int id;
    public String description;
    public double amount;
    public LocalDate date;

    public Expense (String description, double amount) {
        globalId++;
        this.id = globalId;
        this.description = description;
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public String toJson() {
        return "  {\n" +
                "    \"id\": \"" + id + "\",\n" +
                "    \"description\": \"" + description + "\",\n" +
                "    \"amount\": " + amount + ",\n" +
                "    \"date\": \"" + date + "\"\n" +
                "  }";
    }

}
