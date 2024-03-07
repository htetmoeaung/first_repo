package module2.chapter7abstraction;

public class AbstractionEx {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Circle shape");
    }
}
class Square extends Shape{

    @Override
    void draw() {
        System.out.println("Square shape");
    }
}