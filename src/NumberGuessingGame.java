import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random obj = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the number guessing game");
        System.out.println("1-10");
        int number = obj.nextInt(1, 101);
//        System.out.println(number);
        for (int i = 1; i <= i; i++) {
            System.out.print("Enter : ");
            int guess = scan.nextInt();
            if (guess == number) {
                System.out.println("You are the winner");
                System.out.println("The Correct number is " + number);
                System.out.println("Tries : " + i);
                if (i <= 10){
                    System.out.println("Excellent");
                } else {
                    System.out.println("Good");
                }
                break;
            }
            else if (guess < number) {
                System.out.println("The correct number is higher than " + guess);
            }
            else if (guess > number) {
                System.out.println("The correct number is less than " + guess);
            }
        }
    }
}