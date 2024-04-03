package module2.chapter12Exception;

public class Lesson4Finally {
    public static void main(String[] args) {
        try {
            int result = 8/0;
            System.out.println(result);
        } catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("It ok");
        }
    }
}
