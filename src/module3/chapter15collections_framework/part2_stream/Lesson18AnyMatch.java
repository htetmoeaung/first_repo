package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson18AnyMatch {
    public static void main(String[] args) {

        // anyMatch() => only need one of the elements able to divided by 3
        List<Integer> integerList = Arrays.asList(1, 3, 6, 9, 15);
        System.out.println(integerList
                .stream()
                .anyMatch(integer -> integer % 3 == 0));

        List<Integer> integerList1 = Arrays.asList(1, 3, 5, 300, 256, 99, 100);
        System.out.println(integerList1
                .stream()
                .filter(integer -> integer < 300)
                .anyMatch(integer -> integer % 3 == 0));
    }
}
