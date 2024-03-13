package module2.chapter7abstraction;

public class Lesson7DifferentMethodsMedium {

    void calculate(int x,int y,Calculator1 abc){
        abc.cal(x,y);
    }
    public static void main(String[] args) {

        Lesson7DifferentMethodsMedium test1 = new Lesson7DifferentMethodsMedium();
        test1.calculate(5,5,new Sum());

        test1.calculate(5,5,new Sub());
    }
}
interface Calculator1{
    void cal(int number1,int number2);
}
class Sum implements Calculator1{

    @Override
    public void cal(int number1, int number2) {
        System.out.println("Sum of two number is "+(number1+number2));
    }
}

class Sub implements Calculator1{
    @Override
    public void cal(int number1, int number2) {
        System.out.println("Sub of two number is "+(number1-number2));
    }
}