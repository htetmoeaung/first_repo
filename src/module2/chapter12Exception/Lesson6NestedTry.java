package module2.chapter12Exception;

public class Lesson6NestedTry {
    public static void main(String[] args) {
        int a =12;
        int b = 0;

        System.out.println("Start ");
        try {
            try{
                int result = a/b;
                System.out.println(result);
            } catch (ArithmeticException e){
                System.out.println("first exception");
            }

            try {
                int numbers[] = new int[7];
                System.out.println(numbers[3]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("second exception");
            }
            String str = null;
            System.out.println(str.length());

            System.out.println("This is ok");

        } catch (Exception e){
            System.out.println("General Exception");
        }

        System.out.println("End");
    }
}
