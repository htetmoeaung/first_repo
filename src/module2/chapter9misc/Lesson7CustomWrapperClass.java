package module2.chapter9misc;

public class Lesson7CustomWrapperClass {
    public static void main(String[] args) {
        String std1 = new String("htet");
        System.out.println(std1);

        A1 num1 = new A1(8);
        System.out.println(num1);
    }
}
class A1{
    int num;

    A1(int a){
        num = a;
    }

    @Override
    public String toString(){
        return String.valueOf(num);
    }
}
