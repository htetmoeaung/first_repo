package module1.chapter3arrays;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random object = new Random();
//        int randomNum = object.nextInt();
//        int randomNum = object.nextInt(7)
        int randomNum = object.nextInt(1, 7);
        System.out.println(randomNum);
    }
}
