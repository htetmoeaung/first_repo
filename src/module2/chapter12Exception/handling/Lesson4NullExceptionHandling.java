package module2.chapter12Exception.handling;

public class Lesson4NullExceptionHandling {
    public static void main(String[] args) {
        System.out.println("before");

        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("after");
    }
}
