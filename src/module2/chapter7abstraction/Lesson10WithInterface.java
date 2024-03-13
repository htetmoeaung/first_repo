package module2.chapter7abstraction;

public class Lesson10WithInterface {
    public static void main(String[] args) {
        Dog1 akt = new Dog1();
        akt.sound();
    }
}
interface Animal{
    void sound();
}
class Dog1 implements Animal{
    @Override
    public void sound() {
        System.out.println("woof");
    }
}
class Cat1 implements Animal{
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

