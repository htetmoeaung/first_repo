package module2.chapter4oop_basics;

public class Lesson10Exercise {
    public static void main(String[] args) {
        System.out.println(calculate.sum(6, 4));
        System.out.println(calculate.sub(10, 5));
    }
}
class calculate{
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int c, int d){
        return c-d;
    }
}
