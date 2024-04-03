package module2.chapter12Exception.handling;

public class Lesson2ArrayExceptionHandling {
    public static void main(String[] args) {
        System.out.println("before exception");

        int numbers[] = {1,2,3,4,5};

        try {
            numbers[9] = 9;
            System.out.println(numbers);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("After");
    }
}
