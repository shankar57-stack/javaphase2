
class BankAccount {
    int accountNumber;
    String customerName;
    String accountType;
    double balance;

    public BankAccount(int accNum, String name, String type, double initialBalance) {
        this.accountNumber = accNum;
        this.customerName = name;
        this.accountType = type;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited into Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn from Account " + accountNumber);
        } else if (amount > balance) {
            System.out.println("Insufficient balance in Account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            targetAccount.balance += amount;
            System.out.println("₹" + amount + " transferred from Account " 
                               + this.accountNumber + " to Account " + targetAccount.accountNumber);
        } else if (amount > balance) {
            System.out.println("Transfer failed! Insufficient balance in Account " + accountNumber);
        } else {
            System.out.println("Invalid transfer amount!");
        }
    }

    public void displayDetails() {
        System.out.println("Acc No: " + accountNumber + " | Name: " + customerName 
                           + " | Type: " + accountType + " | Balance: ₹" + balance);
    }
}

public class day1hw2 {
    public static void main(String[] args) {
       
        BankAccount acc1 = new BankAccount(101, "Alice", "Savings", 0.0);
        BankAccount acc2 = new BankAccount(102, "Bob", "Current", 0.0);
        BankAccount acc3 = new BankAccount(103, "Charlie", "Savings", 1000.0);

        System.out.println("--- PERFORMING TRANSACTIONS ---");
        
        acc1.deposit(10000);

        acc2.deposit(5000);

        acc1.transfer(acc2, 3000);

        acc2.withdraw(2000);

        System.out.println("\n--- FINAL ACCOUNT BALANCES ---");
        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();
    }
}