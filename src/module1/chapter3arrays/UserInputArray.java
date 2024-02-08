package module1.chapter3arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        int[] userinputarray = new int[size];

        for (int i = 0; i < userinputarray.length; i++) {
            System.out.print("Enter the value : ");
            int number = scanner.nextInt();
            userinputarray[i] = number;
        }

        System.out.println(Arrays.toString(userinputarray));
    }
}
