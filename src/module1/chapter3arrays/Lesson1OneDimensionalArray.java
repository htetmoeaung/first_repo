package module1.chapter3arrays;

import java.util.Arrays;

public class Lesson1OneDimensionalArray {
    public static void main(String[] args) {

        String[] names = {"htet", "Moe", "Aung"};
        int[] numbers = {2, 5, 6, 3, 4, 2, 4, 5, 6, 7, 88, 544, 334};

        System.out.println(names[2]);
        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(names));
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);

        names[2] = "Luffy";
        System.out.println(names[2]);

        int[] number2 = new int[5];
        System.out.println(Arrays.toString(number2));

        number2[3] = 4;

        System.out.println(Arrays.toString(number2));

    }
}
