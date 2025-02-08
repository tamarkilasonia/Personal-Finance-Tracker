
    import java.util.Date;

    public class Transaction {
        private String category;
        private double amount;
        private Date date;
        private String type;  // "income" or "expense"

        public Transaction(String category, double amount, Date date, String type) {
            this.category = category;
            this.amount = amount;
            this.date = date;
            this.type = type;
        }

        // Getters and setters
        public String getCategory() { return category; }
        public void setCategory(String category) { this.category = category; }

        public double getAmount() { return amount; }
        public void setAmount(double amount) { this.amount = amount; }

        public Date getDate() { return date; }
        public void setDate(Date date) { this.date = date; }

        public String getType() { return type; }
        public void setType(String type) { this.type = type; }

        @Override
        public String toString() {
            return "Transaction{" +
                    "category='" + category + '\'' +
                    ", amount=" + amount +
                    ", date=" + date +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

