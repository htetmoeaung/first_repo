package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson11Max {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,5,6,7,8,9);

        int result = list
                .stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(result);

        int result1 = list
                .stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(result1);

        int result2 = list
                .stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(result2);

    }
}
