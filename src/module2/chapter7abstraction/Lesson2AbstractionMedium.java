package module2.chapter7abstraction;

public class Lesson2AbstractionMedium {
    public static void main(String[] args) {
        Human human = new Human() {
            @Override
            void sleep() {
                System.out.println("sleep at 4 am");
            }
        };
        human.sleep();

        Human human1 = new Person2();
        human1.sleep();

        Human human2 = new Person3();
        human2.sleep();
    }
}
abstract class Human{
   abstract void sleep();
}
class Person2 extends Human{

    @Override
    void sleep() {
        System.out.println("sleep 8 hours a day");
    }
}
class Person3 extends Human{

    @Override
    void sleep() {
        System.out.println("sleep 6 hours a day");
    }
}