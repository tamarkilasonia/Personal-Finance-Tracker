import java.util.ArrayList;
import java.util.List;

    public class FinanceManager {
        private List<Transaction> transactions = new ArrayList<>();

        // Add transaction
        public void addTransaction(String category, double amount, String type) {
            transactions.add(new Transaction(category, amount, new java.util.Date(), type));
        }

        // Get total income
        public double getTotalIncome() {
            double totalIncome = 0;
            for (Transaction t : transactions) {
                if (t.getType().equals("income")) {
                    totalIncome += t.getAmount();
                }
            }
            return totalIncome;
        }

        // Get total expenses
        public double getTotalExpenses() {
            double totalExpenses = 0;
            for (Transaction t : transactions) {
                if (t.getType().equals("expense")) {
                    totalExpenses += t.getAmount();
                }
            }
            return totalExpenses;
        }

        // Get current balance (income - expenses)
        public double getBalance() {
            return getTotalIncome() - getTotalExpenses();
        }

        // List all transactions
        public List<Transaction> getTransactions() {
            return transactions;
        }
    }
