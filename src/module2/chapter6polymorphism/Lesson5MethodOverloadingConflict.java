package module2.chapter6polymorphism;

public class Lesson5MethodOverloadingConflict {
    static void cal(int a, double b){
        System.out.println(a);
        System.out.println(b);
    }
    static void cal(double a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        cal(4.5, 2);
        cal(2,4.5);
    }
}
