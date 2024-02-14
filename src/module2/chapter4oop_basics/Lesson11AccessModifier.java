package module2.chapter4oop_basics;

public class Lesson11AccessModifier {
    public int a = 1;

    int b = 2;

    protected int c = 3;

    private int d = 4;

    public static void main(String[] args) {
        Lesson11AccessModifier obj = new Lesson11AccessModifier();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

        modifierA.call();
    }
}

class modifierA{
    static void call(){
        Lesson11AccessModifier obj = new Lesson11AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
//        System.out.println(obj.d);
    }
}
