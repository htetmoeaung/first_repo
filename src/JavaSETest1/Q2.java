package JavaSETest1;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] integers = new int[5];
        for (int i = 0; i < integers.length; i++) {
            System.out.print("Enter the value : ");
            int numbers = scan.nextInt();
            integers[i] = numbers;
        }
        System.out.println(Arrays.toString(integers));
    }
}
