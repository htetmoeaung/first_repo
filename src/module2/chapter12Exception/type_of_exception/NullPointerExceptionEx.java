package module2.chapter12Exception.type_of_exception;

public class NullPointerExceptionEx {
    public static void main(String[] args) {
        System.out.println("Start");

        String name = null;

        // String a = "";

        System.out.println(name.toLowerCase());

        System.out.println("End");
    }
}

