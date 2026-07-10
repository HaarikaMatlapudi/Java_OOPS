public class BankAccount {

    private int balance = 5000;

    public void credit(int amount) {
        balance += amount;
        System.out.println("Balance after successful credit: " + balance);
    }

    public void debit(int amount) {
        balance -= amount;
        System.out.println("Balance after successful debit: " + balance);
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.checkBalance();
        ba.credit(5000);
        ba.debit(2000);
    }
}