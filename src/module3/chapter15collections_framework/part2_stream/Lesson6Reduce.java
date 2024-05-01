package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;

public class Lesson6Reduce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d","e");

        String str = list
                .stream()
                .reduce("Hello ",(s, s2) -> s+s2);
        System.out.println(str);

        String str1 = list
                .stream()
                .reduce((s, s2) -> s+s2).get();
        System.out.println(str1);
    }
}
