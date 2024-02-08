package module1.chapter1the_basics.operators;

public class Lesson9TernaryOperators {
    public static void main(String[] args) {
        int points = 80;

        String result = (points > 40)?"Pass":"Fail";
        System.out.println(result);

        int number =4;
        String result1 = (number %2 ==0 )?"even":"odd";
        System.out.println(result1);

        int point1 = 39;
        String result2 = (point1 >= 40)?"You pass the test":"You fail the task";
        System.out.println(result2);

    }
}
