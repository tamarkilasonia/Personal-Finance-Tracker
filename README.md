# Personal Finance Tracker

A simple **Java** application to track income and expenses. The app allows users to add and view transactions, including transaction type, amount, category, and date. Transactions are stored in a CSV file for easy management.

## Features
- Add income or expense transactions
- View all saved transactions
- Transactions are stored in a CSV file for easy retrieval

## Technologies Used
- **Java** for core application logic
- **CSV file format** for storing transaction data

## Getting Started

### Prerequisites
- **Java** (JDK 8 or later) installed on your machine.
- A **Java IDE** (e.g., IntelliJ IDEA, Eclipse) to run the project.

### Setup
1. Clone the repository to your local machine:
    ```bash
    git clone https://github.com/yourusername/Personal-Finance-Tracker.git
    ```
2. Open the project in your favorite IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the `Main.java` class to start the application.

### Usage
1. The application will ask you to input details for a transaction (type, amount, category, and date).
2. After entering the transaction, it will be saved in the `transactions.csv` file.
3. You can choose to view all the saved transactions.

## File Structure
/Personal-Finance-Tracker │ ├── Main.java # Main class for user interaction ├── TransactionManager.java # Class handling saving and loading transactions └── transactions.csv # CSV file where transactions are stored

