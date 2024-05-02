package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lesson14Peek {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,4,4,5,5,6,7,8,8,8,9);

        Stream<Integer> lists = Stream.of(1,2,3,4,5);

        Stream.of("one","two","three","four")
                .filter(e -> e.length() > 3) // element -> int/string/object{Student, teacher, book}
                .peek(e -> System.out.println("Filter Value "+e)) // output for each array room
                .map(String::toUpperCase)
                .peek(e-> System.out.println("Map Value "+e))
                .forEach(System.out::println);
    }
}
