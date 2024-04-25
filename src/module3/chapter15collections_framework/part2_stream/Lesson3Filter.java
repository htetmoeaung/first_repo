package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson3Filter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("htet htet","Mg Mg","codewall technology","Pyae sone phyo","ko ko");

        list.stream()
                .filter(s -> s.length() > 4 && s.length() < 11)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
