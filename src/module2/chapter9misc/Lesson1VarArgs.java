package module2.chapter9misc;

public class Lesson1VarArgs {

    //Java 5 Features

    static void cal(int a){}
    static void cal(int a,int b){}

    static void cal(int a,int b,int c){}

    static void numbers(int...numbers){ // 3 dots
        for (int abc : numbers){
            System.out.print(abc+"\t");
        }
    }
    public static void main(String[] args) {
        numbers(1,2,3,4,5,6,7);

    }
}
