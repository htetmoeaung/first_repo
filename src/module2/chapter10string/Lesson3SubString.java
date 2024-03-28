package module2.chapter10string;

import java.util.Arrays;

public class Lesson3SubString {
    public static void main(String[] args) {
        String test = "Genshin";

        System.out.println(test.substring(3));

        System.out.println(test.substring(0,3));
        // first is the start
        // second number is the length of the word

        String name = "htet moe aung";
        String[] result = name.split(" ");
        System.out.println(Arrays.toString(result));
    }
}
