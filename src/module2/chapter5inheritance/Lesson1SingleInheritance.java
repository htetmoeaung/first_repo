package module2.chapter5inheritance;

public class Lesson1SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
class Animal{
    int a=9;

    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal{

}



//Inheritance
//Single Inheritance
//Multi-level Inheritance