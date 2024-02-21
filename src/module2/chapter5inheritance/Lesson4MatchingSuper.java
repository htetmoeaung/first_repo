package module2.chapter5inheritance;

public class Lesson4MatchingSuper {
    public static void main(String[] args) {
        Apple ap = new Apple();

    }
}
class Fruit{
    public Fruit(){
        System.out.println("Fruit Default Constructor");
    }
}
class Apple extends Fruit{
    public Apple(){
        super();//invoke the parent constructor
        System.out.println("Apple is red");
    }
}
