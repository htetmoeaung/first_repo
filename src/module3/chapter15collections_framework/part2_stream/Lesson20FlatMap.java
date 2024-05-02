package module3.chapter15collections_framework.part2_stream;

import java.util.ArrayList;
import java.util.List;

public class Lesson20FlatMap {
    public static void main(String[] args) {
        List<List<String>> allStudents = new ArrayList<>();

        List<String> row1Students = new ArrayList<>();
        row1Students.add("AA");
        row1Students.add("BB");
        row1Students.add("CC");

        List<String> row2Students = new ArrayList<>();
        row2Students.add("AAA");
        row2Students.add("BBB");
        row2Students.add("CCC");

        List<String> row3Students = new ArrayList<>();
        row3Students.add("AAAA");
        row3Students.add("BBBB");
        row3Students.add("CCCC");

        allStudents.add(row1Students);
        allStudents.add(row2Students);
        allStudents.add(row3Students);

        System.out.println(allStudents);

        row1Students
                .stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        List<String> list = allStudents
                .stream()
                .flatMap(strings ->strings.stream().map(String::toLowerCase))
                .toList();

        System.out.println(list);

        System.out.println(allStudents.stream().flatMap(s -> s.stream().map(String::toLowerCase)).toList());


    }
}
