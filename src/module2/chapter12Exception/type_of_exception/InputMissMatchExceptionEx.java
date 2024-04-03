package module2.chapter12Exception.type_of_exception;

import java.util.Scanner;

public class InputMissMatchExceptionEx {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");

        int userInput = new Scanner(System.in).nextInt();
        System.out.println(userInput);

        System.out.println("The next operation");
    }
}
