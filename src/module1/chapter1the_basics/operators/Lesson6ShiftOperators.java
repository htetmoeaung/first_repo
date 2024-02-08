package module1.chapter1the_basics.operators;

public class Lesson6ShiftOperators {
    public static void main(String[] args) {
        int a = 11 << 4;//11 * (2^4) = 11 * 16 = 176
        System.out.println(a);

        int b = 10 >> 3;//10 / (2^3) = 10 / 8 = 1
        System.out.println(b);

        int c = 9 >>> 2;
        System.out.println(c);
    }
}
