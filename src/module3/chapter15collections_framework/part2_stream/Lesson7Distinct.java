package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson7Distinct {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,5,6,7,8,8,8,9);

        List<Integer> distinctList = list.stream().distinct().toList();
        System.out.println(distinctList);
    }
}
