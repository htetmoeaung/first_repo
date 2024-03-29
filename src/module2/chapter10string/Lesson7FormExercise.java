package module2.chapter10string;

import java.util.Scanner;

public class Lesson7FormExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = scanner.nextLine();
        String userGender = null;

            if (userName.contains("Mg")) {
                userGender = "male";
            } else if (userName.contains("Ma")) {
                userGender = "female";
            } else {
                System.out.print("Enter your gender : ");
                userGender = scanner.next();
            }

        scanner.nextLine();

        System.out.print("Enter your email : ");

        while (true) {

            String userEmail = scanner.nextLine();

            if (userEmail.endsWith("@gmail.com")) {
                System.out.println("your email form is correct and your gender is "+userGender);
                break;
            } else {
                System.out.println("Your email form is not correct");
                System.out.print("Please enter your email again : ");
            }
        }
    }
}
