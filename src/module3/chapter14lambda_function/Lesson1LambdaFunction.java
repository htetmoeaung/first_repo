package module3.chapter14lambda_function;

interface Test {
    void show();
}

public class Lesson1LambdaFunction {
    public static void main(String[] args) {

        // simple way
        Test test = new Test() {
            @Override
            public void show() {
                System.out.println("This is test1");
            }
        };
        test.show();
        //erase
        Test test2 = () -> { // object { - }
            System.out.println("This is test2");
            System.out.println("This is test2");
        };
        test2.show();
        //shortcut
        Test test3 = () -> System.out.println("This is test3");
        test3.show();
    }
}
