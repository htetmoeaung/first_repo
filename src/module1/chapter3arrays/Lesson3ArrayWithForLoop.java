package module1.chapter3arrays;

public class Lesson3ArrayWithForLoop {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int number : numbers) {
            System.out.print(number * 10+" | ");
        }
    }
}
