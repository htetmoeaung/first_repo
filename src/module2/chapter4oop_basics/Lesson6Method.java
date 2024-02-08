package module2.chapter4oop_basics;

public class Lesson6Method {

    void display(){ // instance method
        System.out.println("This is a instance display");
    }

    static void show(){ // static method
        System.out.println("This is a static show");
    }

    public static void main(String[] args) {
        Lesson6Method obj = new Lesson6Method();
        obj.display();

        Lesson6Method.show();
        show();
    }
}
