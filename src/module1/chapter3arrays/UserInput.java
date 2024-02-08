package module1.chapter3arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name="Htet";
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Username : ");
        String input = scan.next();
        System.out.println("You Typed : "+input);

        //scan.nextLine();
        scan = new Scanner(System.in);

        System.out.print("Enter Your Full Name : ");
        String fullname = scan.nextLine();
        System.out.println("You typed : " + fullname);

        System.out.print("Enter Your Age : " );
        int age = scan.nextInt();
        System.out.println("You typed : " + age);
    }
}
