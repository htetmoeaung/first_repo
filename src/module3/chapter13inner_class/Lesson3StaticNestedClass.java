package module3.chapter13inner_class;

public class Lesson3StaticNestedClass {

    static int a = 10;
    static class Inner{
        static int show(){
            System.out.println("this is show");
            return 6;
        }
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Inner.show());
    }
}
class Call{
    public static void main(String[] args) {
        System.out.println(Lesson3StaticNestedClass.a);
        System.out.println(Lesson3StaticNestedClass.Inner.show());
    }
}
