package module2.chapter12Exception;

public class Lesson8Throw {

    static void makeException(){
        throw new ArithmeticException("my custom exception");
    }
    static void makeException(int a){
        if (a<18){
            throw new RuntimeException("Because you are younger than 18");
        } else {
            System.out.println("you can vote");
        }
    }
    public static void main(String[] args) {
//        makeException();
        makeException(17);
    }
}
