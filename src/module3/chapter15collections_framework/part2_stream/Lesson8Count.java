package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson8Count {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,4,6,7,6,8);

        long result = list
                .stream()
                .filter(integer -> integer%2==0)
                .distinct()
                .count();
        System.out.println(result);

    }
}
