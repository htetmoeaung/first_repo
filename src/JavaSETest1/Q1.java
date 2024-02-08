package JavaSETest1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter divisible number : ");
        int input = scan.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i%input == 0){
                System.out.print(i+",");
            }
        }
    }
}
