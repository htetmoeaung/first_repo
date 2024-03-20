package Programs;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount account = new BankAccount(001,"Htet Moe Aung",800000);
        System.out.println("Welcome To Our Bank");
        System.out.println("1.Your Bank Account\n2.Deposit Money\n3.Withdraw Money\n4.Transfer Money\n5.Exit");

        for (int i = 0; i <= i; i++) {
            System.out.print("Choose your option : ");
            int userInput = scan.nextInt();

            if (userInput == 1){
                account.call();
            } else if (userInput == 2) {
                System.out.print("Enter amount : ");
                long depositAmount = scan.nextLong();
                account.deposit(depositAmount);
            } else if (userInput == 3) {
                System.out.print("Enter amount : ");
                long withdrawAmount = scan.nextLong();
                account.withdraw(withdrawAmount);
            } else if (userInput == 4) {
                System.out.print("Enter the phone number : ");
                long phoneNum = scan.nextLong();
                System.out.print("Enter amount : ");
                long transferAmount = scan.nextLong();
                account.transfer(phoneNum,transferAmount);
            }
            else break;
        }

    }
}
class BankAccount{
    private int id;
    private String name;
    private long balance;

    public BankAccount(int id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public void call(){
        System.out.println("Info : "+id+" "+name+" "+balance);
    }
    public void transfer(long phoneNumber,long amount){
        if (amount > balance ){
            System.out.println("Insufficient amount of balance");
        } else if (amount > 0) {
            System.out.println("You have successfully transferred "+amount+" to "+phoneNumber);
        }
        else {
            System.out.println("Invalid");
        }
    }
    public void deposit(long amount){
        if (amount > 0){
            balance += amount;
            System.out.println("You have successfully deposited "+amount);
        }
        else {
            System.out.println("Invalid");
        }
    }
    public void withdraw(long amount){
        if (amount > balance){
            System.out.println("Insufficient amount of balance");
        } else if (amount > 0 ) {
            balance -= amount;
            System.out.println("You have successfully withdraw "+amount);
        }
        else {
            System.out.println("Invalid");
        }
    }
}