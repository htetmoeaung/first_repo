package module2.chapter10string;

public class Lesson5StringMethods {
    public static void main(String[] args) {
        System.out.println("htet".getClass().getSimpleName());

        System.out.println("htet moe aung".contains("moe"));

        System.out.println("b".equals("B"));
        System.out.println("b".equalsIgnoreCase("B"));

        System.out.println("a".compareTo("b"));
        System.out.println("b".compareToIgnoreCase("A"));

       if (("mg moe aung".startsWith("mg"))){
           System.out.println("This is male");
        }

        System.out.println("fileanime27@gmail.com".endsWith("@gmail.com"));


    }
}
