package module2.chapter6polymorphism;

import java.util.Scanner;

public class Lesson2MethodOverloadingRule1 {

    static void sum(){
        System.out.println("Result is 19");
    }
    static void sum(int a){
        System.out.println(a+a);
    }
    static void sum(int a, int b){
        System.out.println(a-b);
    }
    static void sum(double b){
        System.out.println(b+b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sum(scan.nextInt());
        sum();
//        sum(6,4);
//        sum(2.5);

    }
}
