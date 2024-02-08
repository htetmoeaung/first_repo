package module2.chapter4oop_basics;

import static module2.chapter4oop_basics.company.name;

class company {
    static String name = "Htet Moe Aung";

    int age = 19;
}

public class Lesson1Variables {
    int number1 = 10; //instance variable
    static int number2 = 20; //static variable

    public static void main(String[] args) {
        int a = 15; // local variable
        System.out.println(a);

        System.out.println(number2);


        Lesson1Variables lesson1Variables = new Lesson1Variables();
        System.out.println(lesson1Variables.number1);

        company comp = new company();
        System.out.println(name);
        System.out.println(comp.age);

    }
}
