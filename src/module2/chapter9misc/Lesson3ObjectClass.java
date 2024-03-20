package module2.chapter9misc;
class A{
    void doing(){
        System.out.println("doing method");
    }
}
class B{
    void done(){
        System.out.println("done method");
    }
}
public class Lesson3ObjectClass {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);

        B b = new B();
        System.out.println(b);
    }
}
