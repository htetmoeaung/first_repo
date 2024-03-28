package module2.chapter10string;

import java.util.Scanner;

public class Lesson4MessengerReplyEx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        String[] name1 = name.split(" ");
        System.out.println("Hello, " + name1[0] + " Mingalarbar");
        System.out.println("Thank you, " + name1[name1.length-1]);

    }
}
