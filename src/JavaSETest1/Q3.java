package JavaSETest1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter multiplication number : ");
        int num1 = scan.nextInt();
        for (int i = 1; i < 13; i++) {
            int answer = num1*i;
            System.out.println(num1+" x "+i+" = "+answer);
        }
    }
}
