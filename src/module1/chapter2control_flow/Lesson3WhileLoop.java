package module1.chapter2control_flow;

import java.security.spec.RSAOtherPrimeInfo;

public class Lesson3WhileLoop {
    public static void main(String[] args) {
        int countdown = 5;
        while (countdown > 0){
            System.out.println(countdown);
            countdown -= 1;
            if (countdown == 0){
                System.out.println("Happy New Year");
                break;
            }
        }
        int loop = 20;
        do {
            System.out.println("To Infinity and Beyond");
        }
        while(loop < 10);
    }
}
