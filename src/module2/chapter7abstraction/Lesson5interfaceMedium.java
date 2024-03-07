package module2.chapter7abstraction;

public class Lesson5interfaceMedium {
    public static void main(String[] args) {
        testable test = new testable() {
            @Override
            public void call() {
                System.out.println("Hii");
            }
        };
        test.call();
        Child1 child1 = new Child1();
        child1.call();

        Child2 child2 = new Child2() {
            @Override
            public void call() {
                System.out.println("Hi again");
            }
        };
        child2.call();

    }
}
interface testable {
    void call();
}
class Child1 implements testable{

    @Override
    public void call() {
        System.out.println("Child 1 method");
    }
}
abstract class Child2 implements testable{

}
