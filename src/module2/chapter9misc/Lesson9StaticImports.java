package module2.chapter9misc;

/**
 * Java 5 Feature
 * Java Best Practices
 */

import java.util.Scanner;

import static java.lang.Math.*;


public class Lesson9StaticImports {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.println(addExact(5,5));
        System.out.println(subtractExact(10,5));
        System.out.println(PI);
    }
}
