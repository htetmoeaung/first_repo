package module2.chapter7abstraction;

public class Lesson1AbstractionSyntax {
    public static void main(String[] args) {
        Parent parent = new Parent() {
            @Override
            void eat() {
                System.out.println("Not eating");
            }
        };
        parent.eat();
        parent.job();
    }
}
abstract class Parent{
    void job(){
        System.out.println("Online shopping");
    }

   abstract void eat();
}
