package JavaSETest1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];
        names[0] = "Aung";
        names[1] = "Maung";
        names[2] = "Code";
        names[3] = "Java";
        names[4] = "IT";

        System.out.println(Arrays.toString(names));

        System.out.print("Search : ");
        String input = scan.next();

        switch (input){
            case "Aumg" :
                System.out.println("Aung is located in index 0");break;
            case "Maumg" :
                System.out.println("Maung is located in index 1");break;
            case "Code" :
                System.out.println("Code is located in index 2");break;
            case "Java" :
                System.out.println("Java is located in index 3");break;
            case "IT" :
                System.out.println("IT is located in index 4");break;
        }




    }
}
