package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson12FindFirst {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,4,4,5,5,6,7,8,8,8,9);
        System.out.println(list.stream().findFirst().get());

        System.out.println(list.get(0));
    }
}
