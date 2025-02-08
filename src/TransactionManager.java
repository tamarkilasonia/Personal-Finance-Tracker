
    import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    public class TransactionManager {
        // Method to save a transaction to a file
        public static void saveTransaction(String category, double amount, String type, String date) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv", true))) {
                // Writing data to the file in CSV format
                writer.write(type + "," + amount + "," + category + "," + date);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Method to load and display all transactions from the file
        public static void loadTransactions() {
            try (BufferedReader reader = new BufferedReader(new FileReader("transactions.csv"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Splitting the CSV line into individual transaction details
                    String[] transactionDetails = line.split(",");
                    System.out.println("Type: " + transactionDetails[0] + ", Amount: " + transactionDetails[1]
                            + ", Category: " + transactionDetails[2] + ", Date: " + transactionDetails[3]);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            // Sample usage
            saveTransaction("Salary", 2000.00, "Income", "2025-02-08");
            saveTransaction("Groceries", 50.00, "Expense", "2025-02-08");

            // Displaying the saved transactions
            loadTransactions();
        }
    }

