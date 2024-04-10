package module3.chapter13inner_class;

public class Lesson2LocalInnerClass {
    private int a = 9;
    void sum(){
        class Inner {
            void display(){
                System.out.println("Result "+a);
            }
        }

        Inner obj = new Inner();
        obj.display();
    }

    public static void main(String[] args) {
        Lesson2LocalInnerClass obj = new Lesson2LocalInnerClass();
        obj.sum();
    }
}
