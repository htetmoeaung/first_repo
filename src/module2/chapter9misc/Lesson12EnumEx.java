package module2.chapter9misc;

import java.util.Scanner;

public class Lesson12EnumEx {

    enum Gender{Male,Female}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name : ");
        String name = scan.nextLine();
        System.out.print("Gender : ");
        Gender genders = Gender.valueOf(scan.next());
        switch (genders){
            case Male:
                System.out.println("Mg "+name);break;
            case Female:
                System.out.println("Ma "+name);break;
        }
    }
}
