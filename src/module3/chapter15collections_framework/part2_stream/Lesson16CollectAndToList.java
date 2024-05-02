package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson16CollectAndToList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,3,4,4,5,6,7,8,10,8,9);
        System.out.println(list);

        List<Integer> filterlist = list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
        System.out.println(filterlist);

        List<Integer> filterlist1 = list.stream().filter(integer -> integer%2==0).toList();
        System.out.println(filterlist1);
    }
}
