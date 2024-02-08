package module1.chapter1the_basics.operators;

public class Lesson4LogicalOperators {
    public static void main(String[] args) {
        boolean condition1 = 15>19;
        boolean condition2 = 19>15;

        boolean result1 = condition1 && condition2;
        System.out.println(result1);
        boolean result2 = condition1 || condition2;
        System.out.println(result2);
    }
}
