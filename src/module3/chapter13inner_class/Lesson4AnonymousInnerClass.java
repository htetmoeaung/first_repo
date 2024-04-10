package module3.chapter13inner_class;

interface ABC{
    void show();
}

abstract class A{
    abstract void display();
}

class B extends A{

    @Override
    void display() {

    }
}

public class Lesson4AnonymousInnerClass {


    public static void main(String[] args) {
        Lesson4AnonymousInnerClass obj = new Lesson4AnonymousInnerClass();

        A a = new A() {
            @Override
            void display() {

            }
        };

        ABC abc = new ABC() {
            @Override
            public void show() {

            }
        };

        new ABC() {
            @Override
            public void show() {

            }
        };

        new B();
    }

}
