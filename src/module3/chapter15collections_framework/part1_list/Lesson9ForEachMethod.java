package module3.chapter15collections_framework.part1_list;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lesson9ForEachMethod {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7);

//        for (int i = 0; i < integers.size(); i++) {
//            System.out.println(integers.get(i));
//        }
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println("=====");

        integers.forEach(integer -> System.out.println(integer));
        System.out.println("=====");

        integers.forEach(System.out::println);

    }
}
