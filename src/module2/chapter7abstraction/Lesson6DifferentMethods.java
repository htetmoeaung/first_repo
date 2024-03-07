package module2.chapter7abstraction;

interface testable3{
    void test(String name);
}
interface Calculator{
    void call(int number1, int number2);
}
public class Lesson6DifferentMethods {
    void show(String name,testable3 testable3 ){
        System.out.print("My name is : "+ name);
        testable3.test(name);
    }
    void calculate(int a, int b, Calculator abc){
        abc.call(a,b);
    }

    public static void main(String[] args) {
        Lesson6DifferentMethods obj = new Lesson6DifferentMethods();

        obj.show("Htet", new testable3() {
            @Override
            public void test(String name) {
                System.out.println(" Moe Aung");
            }
        });

        obj.calculate(5, 5, new Calculator() {
            @Override
            public void call(int number1, int number2) {
                System.out.println("Result = "+(number1+number2));
            }
        });

        obj.calculate(10, 5, new Calculator() {
            @Override
            public void call(int number1, int number2) {
                System.out.println("Result = "+(number1-number2));
            }
        });


    }
}
