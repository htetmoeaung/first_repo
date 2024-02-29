package module2.chapter6polymorphism;

public class Lesson6MethodOverriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.job();
    }
}
class Parent{
    void job(){
        System.out.println("Seller");
    }
    void something(){
        System.out.println("do something");
    }
}
class Child extends Parent{
    @Override
    void job() {
        super.something(); // invoke the something method
        System.out.println("Software developer");
    }
}
