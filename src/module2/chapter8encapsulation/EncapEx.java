package module2.chapter8encapsulation;

public class EncapEx {
    public static void main(String[] args) {
        Bankaccount person1 = new Bankaccount(001,10000);

//        person1.setId(001);
//        person1.setBalance(1000);

        person1.deposit(5000);
//        System.out.println("Account balance "+person1.getBalance());
        person1.withdraw(15000);
    }
}
class Bankaccount{
    private  int id;
    private long balance;

    public Bankaccount(int id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount){
        if (amount>0){
            balance += amount;
            System.out.println("Deposit of "+amount+" successfully . "+"New Balance "+balance);
        }
        else {
            System.out.println("Invalid amount of deposit");
        }
    }
//    public void withdraw(long amount){
//        if (amount>=0 && amount<balance){
//            balance -= amount;
//            System.out.println("Withdraw of "+amount+" successfully . "+"New Balance "+balance);
//        }
//        else {
//            System.out.println("Invalid amount of withdraw");
//        }
//    }
    public void withdraw(long amount){
        if (amount > balance){
            System.out.println("Insufficient Amount");
        }
        else if (amount > 0){
            balance -= amount;
            System.out.println("Withdraw of "+amount+" successfully . "+"New Balance "+balance);
        }
        else {
            System.out.println("Invalid amount of withdraw");
        }
    }
}
