package module2.chapter4oop_basics;

import java.util.Scanner;

public class Lesson8ReturnIf {
    static String validate(){
        System.out.print("Enter your age = ");
        Scanner obj = new Scanner(System.in);

        int userInput = obj.nextInt();
        if (userInput>18){
            return "can";
        }
        return "can't";
    }

    static String validate1(){
        System.out.print("Enter Your Age = ");
        int userinput1 = new Scanner(System.in).nextInt();

        if (userinput1 > 18) {
            System.out.println("You can vote");
        }
//        else {
//            System.out.println("you can't vote");
//        }
        return "you can't vote";
    }



    public static void main(String[] args) {
        String result = validate();
        System.out.println("You "+result+" vote");
        validate1();
    }
}
