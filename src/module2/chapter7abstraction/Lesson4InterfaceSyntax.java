package module2.chapter7abstraction;

public class Lesson4InterfaceSyntax {
    public static void main(String[] args) {
        testable1 testable1 = new testable1() {
            @Override
            public void eat() {
                System.out.println("Not eating");
            }
        };
        testable1.eat();

        testable1.sleep();

        
    }
}
interface testable1{
    //abstract method
    void eat();

    //instance method
    default void sleep(){}

    //static method
    static void call(){}
}
