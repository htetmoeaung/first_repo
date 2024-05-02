package module3.chapter15collections_framework.part2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson21OldWay {
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

        for (String Students : row1Students){
            System.out.print(Students.toLowerCase()+" ");
        }

        for (List<String> rowStudents : allStudents){
            for (String students : rowStudents){
                System.out.print(students.toLowerCase()+" ");
            }
        }
        System.out.println();

        List<String> studentlist = allStudents.stream()
                .flatMap(studentname -> studentname.stream().map(String::toLowerCase))
                .collect(Collectors.toList());
        studentlist.add("htet");
        System.out.println(studentlist);
    }
}
