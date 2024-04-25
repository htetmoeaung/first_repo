package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lesson2Filter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        integerList.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) return true;
                return false;
            }

            ;
        }).forEach(System.out::println);

        System.out.println(integerList.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 3 == 0) return true;
                return false;
            }
        }).toList());

        integerList.stream().filter(integer -> {
            if (integer % 2 == 0) return true;
            return false;
        }).forEach(System.out::println);
                                                                 // condition
        System.out.println(integerList.stream().filter(integer -> integer % 3 == 0).toList());
    }
}
