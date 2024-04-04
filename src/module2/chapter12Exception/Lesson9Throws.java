package module2.chapter12Exception;

import java.io.FileNotFoundException;

public class Lesson9Throws {

    static void result(int a) throws FileNotFoundException{
        if (a%2==0){
            throw new FileNotFoundException("You are ugly");
        } else {
            System.out.println("okk ");
        }
    }
    public static void main(String[] args) {
        try {
            result(22);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
