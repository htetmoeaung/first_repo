package module2.chapter7abstraction;

public class InterfaceEx {
    public static void main(String[] args) {
        Circle1 obj1 = new Circle1(5);
        System.out.println(obj1.calculateArea());

        Square1 obj2 = new Square1(2, 5);
        System.out.println(obj2.calculateArea());
    }
}

interface Shape1 {
    double calculateArea();
}

class Circle1 implements Shape1 {
    double radius;


    // Alt + Insert = class constructor
    // Ctrl + Alt + L = format the coding
    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square1 implements Shape1 {
    double length;
    double height;

    public Square1(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return length * height;
    }
}