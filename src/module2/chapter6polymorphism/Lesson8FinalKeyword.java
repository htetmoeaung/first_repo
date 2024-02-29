package module2.chapter6polymorphism;

public class Lesson8FinalKeyword {
    public static final int number = 180;

    public static void main(String[] args) {
        int a = 3;
        a= 6;
        final int b = 5;
        // b= 10;

        final String champion = "Argentina";
        // champion = "France";
    }
}
class Use{

    public static final void show(){
        System.out.println("test");
    }
    public static void main(String[] args) {
        System.out.println(Lesson8FinalKeyword.number);
        show();
    }
}
class User1{
    // can't override the method because of the final keyword
}