package module2.chapter5inheritance;

public class Lesson3HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.show1();

        Child2 child2 = new Child2();
        child2.show2();
    }
}
class Parent1{
    void parent(){
        System.out.println("Parent Method");
    }
}
class Child1 extends Parent1{
    void show1(){
        System.out.println("Child1 Method");
    }
}
class Child2 extends Parent1{
    void show2(){
        System.out.println("Child2 Method");
    }
}