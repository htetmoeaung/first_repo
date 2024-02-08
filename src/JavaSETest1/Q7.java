package JavaSETest1;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the numbers : ");
            int number = scan.nextInt();
            numbers[i] = number;
        }

        for (int number : numbers) {
            if (number%3 !=0){
                System.out.println(number);
            }
        }


    }
}
