package JavaSETest1;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int[] input = new int[scan.nextInt()];

        for (int i = 0; i < input.length; i++) {
            System.out.print("Enter a number : ");
            int num2 = scan.nextInt();
            num2*=3;
            input[i] = num2;
        }
        for (int i : input) {
            System.out.print(i+"  ");
        }
    }
}
