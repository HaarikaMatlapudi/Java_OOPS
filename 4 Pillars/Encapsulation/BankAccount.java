public class BankAccount {

    private int balance = 5000;

    public void credit(int amount) {
        balance += amount;
        System.out.println("Balance after successful credit: " + balance);
    }

    public void debit(int amount) {
        if(amount>balance){
            System.out.prinln("Balance Insufficient:="):
        }else{
            balance -= amount;
            System.out.println("Balance after successful debit: " + balance);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        BankAccount ba=new BankAccount();
        
        System.out.print("Enter amount to credit: ");
        int credit=sc.nextInt();
        ba.credit(credit);
        ba.balance();

        System.out.print("Enter amount to debit: ");
        int debit=sc.nextInt();
        ba.debit(debit);
        ba.balance();
    }
}
