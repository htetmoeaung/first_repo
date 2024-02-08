package module1.chapter1the_basics.operators;

public class Lesson7AssignmentOperators {
    // =, +=, -=, *=, /= , %=
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        b += a;
        System.out.println(b);

        int c = 8;
        int d = 4;
        d -= c;
        System.out.println(d);

        int e = 2;
        e *= 3;
        System.out.println(e);
    }
}
