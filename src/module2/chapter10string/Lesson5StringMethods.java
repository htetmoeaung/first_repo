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


        System.out.println("htet".charAt(1));

        System.out.println("htet is a ten".indexOf('t'));
        System.out.println("htet is a ten".lastIndexOf('t'));

        String name1 = " ";

        System.out.println(name1.isBlank());
        System.out.println(name1.isEmpty());

        System.out.println(" htet moe aung ".length());
        System.out.println(" htet moe aung ".trim().length());


    }
}
