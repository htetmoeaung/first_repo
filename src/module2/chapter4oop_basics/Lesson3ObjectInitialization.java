package module2.chapter4oop_basics;

public class Lesson3ObjectInitialization {
    int a;
    String sometext;

    public static void main(String[] args) {
        Lesson3ObjectInitialization obj = new Lesson3ObjectInitialization();
        obj.a = 10;
        obj.sometext = "Hi";

        alian alian1 = new alian();
        alian1.name = "Cat";
        alian1.age = 9;

        System.out.println(alian1.name);
        System.out.println(alian1.age);

    }
}
class alian {
    String name  = "Pluto";
    int age = 10;
}
