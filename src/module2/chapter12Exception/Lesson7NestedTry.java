package module2.chapter12Exception;

public class Lesson7NestedTry {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            try {
                try {
                    int result = a / b;
                    System.out.println(result);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("first exception");
                }
            } catch (NullPointerException e) {
                System.out.println("second exception");
            }
        } catch (Exception e) {
            System.out.println("general exception");
        }
    }
}
