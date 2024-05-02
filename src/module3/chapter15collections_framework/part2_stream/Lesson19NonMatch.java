package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson19NonMatch {
    public static void main(String[] args) {
        //nonMatch() =if the conditions are false the result is true
        List<Integer> integers = Arrays.asList(2, 4, 5, 8, 10);
        System.out.println(integers
                .stream()
                .noneMatch(i -> i % 3 == 0));
    }
}
