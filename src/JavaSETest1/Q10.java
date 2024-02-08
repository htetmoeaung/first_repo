package JavaSETest1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number : ");
            int number = scan.nextInt();
            numbers[i] = number;
        }
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        if (a > b){
            if (a > c){
                System.out.println(a + " is the largest");
            }
            else {
                System.out.println(c + " is the largest");
            }
        }
        else {
            if (b > c){
                System.out.println(b + " is the largest");
            }
            else {
                System.out.println(c + " is the largest");
            }
        }
        if (a < b) {
            if (a < c) {
                System.out.println(a + " is the smallest");
            } else {
                System.out.println(c + " is the smallest");
            }
        }
        else {
            if (b < c){
                System.out.println(b+ " is the smallest");
            }
            else {
                System.out.println(c + " is the smallest");
            }
        }


    }
}
