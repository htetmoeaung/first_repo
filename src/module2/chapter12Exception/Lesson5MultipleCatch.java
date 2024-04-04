package module2.chapter12Exception;

public class Lesson5MultipleCatch {
    public static void main(String[] args) {
        System.out.println("Before");
        int a = 12;
        int b = 2;

        try{
            int result = a/b; // by 0
            System.out.println(result);

            int numbers[] = new int[7]; // arrays index out of bound
            System.out.println(numbers[3]);

            String str = null; // null pointer
            System.out.println(str.length());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("solve");
        } catch (NullPointerException e){
            System.out.println("solve problem");
        }catch (Exception e){
            System.out.println("general exception");
        } finally {
            System.out.println("ok");
        }

        System.out.println("After");
    }
}
