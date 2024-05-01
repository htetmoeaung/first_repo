package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson9Limit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,5,6,7,8,8,8,9);
        System.out.println(list.stream().limit(3).toList());

        System.out.println(list
                .stream()
                .distinct()
                .limit(4)
                .toList());

        list.stream()
                .filter(integer -> integer%2==0)
                .distinct()
                .limit(2)
                .forEach(System.out::println);
    }
}
