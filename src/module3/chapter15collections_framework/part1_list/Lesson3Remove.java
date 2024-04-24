package module3.chapter15collections_framework.part1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson3Remove {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(9);
        integerList.add(8);
        integerList.add(7);
        integerList.add(7);
        integerList.add(6);
        integerList.add(6);
        integerList.add(6);
        integerList.add(6);
        System.out.println(integerList);

        integerList.remove(Integer.valueOf(7));
        integerList.remove(5);
        System.out.println(integerList);

        List<String> stringList = new ArrayList<>();
        //  generic
        stringList.add("aung aung");
        stringList.add("moe moe");
        stringList.add("kyaw kyaw");
        stringList.add("htet htet");
        stringList.add("ye ye");
        stringList.add("luffy dono");
        stringList.add("hlaing hlaing");
        stringList.add("pyae sone");
        stringList.add("thar shan");

        System.out.println(stringList);

        stringList.remove(6);
        System.out.println(stringList);

        stringList.remove(2);
        System.out.println(stringList);

        List delist = Arrays.asList("aung aung","moe moe","kyaw kyaw","htet htet");
        System.out.println("Remove List "+delist);

        stringList.removeAll(delist);
        System.out.println(stringList);
    }
}
