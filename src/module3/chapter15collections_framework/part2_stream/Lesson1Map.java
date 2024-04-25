package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Lesson1Map {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        /*
        step 1=> change to stream
         */

        Stream<Integer> stream1 = integerList.stream();

        /*
        step 2=> use map method
         */

//        Stream<Integer> integerStream = stream1.map(new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer+100; // operation
//            }
//        });
//
//        integerStream.forEach(System.out::println);


        Stream<Integer> integerStream1 = stream1.map(integer -> integer + 1000);

        /*
        step 3=> change back to list
        */
//        List<Integer> integers = stream1.toList();
//        System.out.println(integers);

        /*
        step 4=> loop and output
         */
//        integerStream1.forEach(System.out::println);

        integerList.stream()
                .map(integer -> integer+50)
                .forEach(System.out::println);

        System.out.println(integerList.stream()
                .map(integer -> integer + 60)
                .toList());


    }
}
