package JavaSETest1;

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        // still not done not the correct output
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the numbers = ");
            int a = scan.nextInt();
            numbers[i] = a;
        }
        int number = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] > number){
                    number = numbers[j];
            }
        }
        System.out.println("The Largest number is " +number);

    }
}
