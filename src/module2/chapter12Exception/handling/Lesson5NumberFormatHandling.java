package module2.chapter12Exception.handling;

public class Lesson5NumberFormatHandling {
    public static void main(String[] args) {
        System.out.println("before");
        String str = "abc";
        try {
            int number = Integer.parseInt(str);
            System.out.println(number);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
        System.out.println("after");
    }
}
