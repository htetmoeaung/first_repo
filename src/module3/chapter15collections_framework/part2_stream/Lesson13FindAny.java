package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson13FindAny {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,4,4,5,6,7,8,10,8,9);

        System.out.println(list.stream().findAny().get());

        System.out.println(list.stream().filter(integer -> integer%5==0).findAny().get());
    }
}
