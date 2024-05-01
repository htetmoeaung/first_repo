package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson10Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 45, 300, 568, 245, 75, 6, 9, 20);

        System.out.println(list
                .stream()
                .filter(integer -> integer < 300)
                .sorted(Comparator.naturalOrder())
                .toList());

        list.stream()
                .filter(integer -> integer < 300)
                .sorted()
                .forEach(System.out::println);
    }
}
