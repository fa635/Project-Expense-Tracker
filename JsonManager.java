import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class JsonManager {

    public void writeExpensesToJson(ArrayList<Expense> expenses) {

        StringBuilder json = new StringBuilder();
        json.append("[");
        for (int i = 0; i < expenses.size(); i++) {
            json.append("\n");
            json.append(expenses.get(i).toJson());
            if (i < expenses.size() - 1) {
                json.append(", ");
            }
        }
        json.append("\n]");


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.json"))) {
            writer.write(json.toString());
            System.out.println("ArrayList of objects has been written to the file as JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
