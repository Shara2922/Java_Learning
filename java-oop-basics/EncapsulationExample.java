// ENCAPSULATION

// Encapsulation hides internal data using private variables and provides access via public methods.

class BankAccount {
    private int balance = 1000; // Private: not accessible directly

    public int getBalance() {
        return balance;  // Public method to access private data
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}
