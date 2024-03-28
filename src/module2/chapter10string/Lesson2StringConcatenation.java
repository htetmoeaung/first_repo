package module2.chapter10string;

public class Lesson2StringConcatenation {
    public static void main(String[] args) {
        String name = "htet" + "mow";
        String name1 = 1+2+"htet"+4+5;

        String test1 = "one";
        String test2 = test1.concat(" two");

        StringBuffer test3 = new StringBuffer("one");
        test3.append(" two");
        test3.append(" three");
        test3.append(" four");
        test3.append(" five");

        System.out.println(test3);
    }
}
