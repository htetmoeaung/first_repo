package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson15Skip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,4,4,5,6,7,8,10,8,9);

        list.stream()
                .filter(integer -> integer%2==0)
                .skip(3)
                .forEach(System.out::println);

        list
                .stream()
                .filter(integer -> integer%2==0)
                .limit(4)
                .skip(2)
                .forEach(System.out::println);
    }
}
