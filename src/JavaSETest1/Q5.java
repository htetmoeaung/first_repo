package JavaSETest1;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numbers = new int[3][5];

        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                System.out.print("Enter the value : ");
                numbers[r][c] = scan.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
