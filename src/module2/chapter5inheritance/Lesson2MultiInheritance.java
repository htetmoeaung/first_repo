package module2.chapter5inheritance;

public class Lesson2MultiInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.grandparent();
        child.parent();
        child.child();
    }
}
class GrandParent{
    int a = 50;
    void grandparent (){
        System.out.println("GrandParent Method");
    }
}
class Parent extends GrandParent{
    int b= 30;
    void parent(){
        System.out.println("Parent Method");
    }
}
class Child extends Parent{
    int c =10;
    void child(){
        System.out.println("Child Method");
    }

    @Override
    void parent() {
        System.out.println("Overriding Parent Method");
    }
}