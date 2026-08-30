public class Bank {
    static class BankAccount {
        protected String accountNumber;
        protected String holderName;
        protected double balance;
        public BankAccount(String accountNumber, String holderName, double balance) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.balance = balance;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + " | New Balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
            } else if (amount > balance) {
                System.out.println("Insufficient balance.");
            } else {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
            }
        }
        public double calculateInterest() {
            return 0.0;
        }
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: " + balance);
            System.out.println("Interest: " + calculateInterest());
        }
    }
    static class SavingsAccount extends BankAccount {
        private static final double interestRate = 0.06; 
        public SavingsAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }
        public double calculateInterest() {
            return balance * interestRate;
        }
        public void displayAccountDetails() {
            System.out.println("Savings Account Details");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: 6%");
            System.out.println("Interest Earned: " + calculateInterest());
        }
    }
    static class CurrentAccount extends BankAccount {
        private static final double interestRate = 0.03; 
        public CurrentAccount(String accountNumber, String holderName, double balance) {
            super(accountNumber, holderName, balance);
        }
        public double calculateInterest() {
            return balance * interestRate;
        }
        public void displayAccountDetails() {
            System.out.println("Current Account Details");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: 3%");
            System.out.println("Interest Earned: " + calculateInterest());
        }
    }
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount("1234", "abc", 20000);
        BankAccount account2 = new CurrentAccount("5678", "pqr", 10000);
        account1.displayAccountDetails();
        account1.deposit(5000);
        account1.withdraw(2000);
        System.out.println();
        account2.displayAccountDetails();
        account2.deposit(3000);
        account2.withdraw(15000); 
        System.out.println();
        System.out.println("Final Details after Transactions:");
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();
    }
}