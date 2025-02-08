import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for transaction details
        System.out.println("Enter the transaction type (Income/Expense): ");
        String type = scanner.nextLine();

        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble()

        System.out.println("Enter the category (e.g., Salary, Groceries, etc.): ");
        String category = scanner.nextLine();

        System.out.println("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        // Save the transaction
        TransactionManager.saveTransaction(category, amount, type, date);

        // Ask if the user wants to see all transactions
        System.out.println("Do you want to see all transactions? (yes/no)");
        String showTransactions = scanner.nextLine();

        if (showTransactions.equalsIgnoreCase("yes")) {
            TransactionManager.loadTransactions(); // Display all transactions
        }

        scanner.close(); // Close the scanner
    }
}
