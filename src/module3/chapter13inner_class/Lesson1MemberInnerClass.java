package module3.chapter13inner_class;

public class Lesson1MemberInnerClass {

    // Encapsulation
    // Access to other class member
    // Logic Grouping

    private int lesson1Data = 23;

    void test() {
        System.out.println();
    }

    class In {
        void show() {
            System.out.println("Inner Class");
            System.out.println(lesson1Data);
        }
    }

    public static void main(String[] args) {
        Lesson1MemberInnerClass obj = new Lesson1MemberInnerClass();
        System.out.println(obj.lesson1Data);
        obj.test();

        In inner = obj.new In();
        inner.show();
    }

}
