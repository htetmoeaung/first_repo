package module2.chapter4oop_basics;

public class Lesson10 {
    static void calculator(int num1,int num2){
        int a =num1;
        int b =num2;
        int reuslt = a+b;
        System.out.println(reuslt);
    }

    static void fullname(String firstname,String lastname){
        System.out.println((firstname+lastname).toUpperCase());
    }

    public static void main(String[] args) {
        calculator(23,7);
        fullname("htet", "aung");
    }
}
