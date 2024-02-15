package module2.chapter4oop_basics;

public class Lesson13Constructor {

    public static void main(String[] args) {
        Person1 object = new Person1();
        Person1 object2 = new Person1(2);
        Person1 object3 = new Person1(3);

        object.show();

    }

}
class Person1{
    Person1(){
        System.out.println("I'm default constructor");
    }
    Person1(int a){
        System.out.println("I'm parameterized constructor");
    }
    void show(){
        System.out.println("I'm method");
    }
}
