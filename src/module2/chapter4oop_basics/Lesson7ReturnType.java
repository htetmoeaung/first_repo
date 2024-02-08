package module2.chapter4oop_basics;

public class Lesson7ReturnType {
    static void calculate(){
        int a =3;
        int b = 5;
        int result = a+b;
        System.out.println("Sum of a + b ="+result);
    }

    static int sum(){
        return 35;
    }

    static String name (){
        System.out.println("Another One");
        return "htet moe aung";
    }


    public static void main(String[] args) {
        calculate();

        System.out.println(name());
    }
}
