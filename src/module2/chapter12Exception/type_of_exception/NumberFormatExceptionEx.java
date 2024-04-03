package module2.chapter12Exception.type_of_exception;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        System.out.println("Start");

        String str = "abc";
        int number = Integer.parseInt(str);
        System.out.println(number);

        System.out.println("End");
    }
}
