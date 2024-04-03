package module2.chapter12Exception.handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lesson3InputMissMatchHandlind {
    public static void main(String[] args) {
        System.out.print("Enter your id : ");
        try {
            int userInput = new Scanner(System.in).nextInt();
            System.out.println(userInput);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
