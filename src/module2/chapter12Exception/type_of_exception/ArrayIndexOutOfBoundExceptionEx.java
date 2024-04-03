package module2.chapter12Exception.type_of_exception;

public class ArrayIndexOutOfBoundExceptionEx {
    public static void main(String[] args) {
        System.out.println("Before exception");

        int numbers[] = {1,2,3,4,5};

        numbers[9] = 23;
        System.out.println(numbers[9]);

        System.out.println("after");
    }
}
