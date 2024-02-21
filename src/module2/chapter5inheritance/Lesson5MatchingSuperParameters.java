package module2.chapter5inheritance;

public class Lesson5MatchingSuperParameters {
    public static void main(String[] args) {
        Child4 aung = new Child4(19);
    }
}
class Parent4{
    public Parent4(int num1){
        System.out.println("Parent is "+num1);
    }
}
class Child4 extends Parent4{
    public Child4(int num1){
        super(num1);
        System.out.println("Child is "+num1);
    }
}
