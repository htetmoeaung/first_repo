package module2.chapter12Exception.handling;

public class Lesson1ArithmeticHandling {
    public static void main(String[] args) {
        System.out.println("Before ");

        int a = 6;
        int b = 0;

        try {
            int result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e){

//           System.out.println(e.getMessage());
//            System.out.println("This is exception");

            int result = a/(b+3);
            System.out.println(result);
        }
        System.out.println("After");
    }
}