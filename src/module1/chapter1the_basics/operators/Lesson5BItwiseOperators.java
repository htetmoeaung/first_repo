package module1.chapter1the_basics.operators;

public class Lesson5BItwiseOperators {
    public static void main(String[] args) {
        boolean result1 = false & true;
        System.out.println(result1);

        boolean result2 = true | false;
        System.out.println(result2);

        int result3 = 12 ^ 6;
        System.out.println(result3);

        int result4 = 12 & 5;
        System.out.println(result4);

        int result5 = 12 | 8;
        System.out.println(result5);
    }
}
