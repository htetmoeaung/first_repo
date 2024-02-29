package module2.chapter6polymorphism;

public class Lesson7TypeCasting {
    int a= 3;
    double b = a; // widening casting
    int c = (int)b; // narrow casting

    Child1 obj = new Child1();

    Parent1 obj1 = new Child1(); // up casting

    Child1 obj2 = (Child1) new Parent1(); // down casting


}
class Parent1{
    static void show(){
        System.out.println("Hi guys");
    }
}
class Child1 extends Parent1{}
