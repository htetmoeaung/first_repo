import javax.swing.*;
import java.util.Scanner;

public class Calculator extends JFrame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num1 = scan.nextInt();

        System.out.print("Enter sign = ");
        String sign = scan.next();

        System.out.print("Enter the number = ");
        int num2 = scan.nextInt();

        switch (sign){
            case "+" :
                System.out.println((num1+sign+num2)+ " = "+ (num1 + num2));break;
            case "-" :
                System.out.println((num1+sign+num2)+ " = " + (num1 - num2));break;
            case "x" :
                System.out.println((num1+sign+num2)+ " = " + (num1 * num2));break;
            case "/" :
                System.out.println((num1+sign+num2)+ " = "+ (num1 / num2));break;
            case "%" :
                System.out.println((num1+sign+num2)+ " = " + (num1 % num2));break;
        }
    }
}
