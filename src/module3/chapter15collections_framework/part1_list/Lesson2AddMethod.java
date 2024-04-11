package module3.chapter15collections_framework.part1_list;

import java.util.*;

public class Lesson2AddMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("luffy");
        list.add('c');
        list.add(false);
        System.out.println(list);

        list.add(1,"dono");
        System.out.println(list);

        List<Integer> integerList = new ArrayList<> ();
        integerList.add(10);
        integerList.add(9);
        integerList.add(8);

        list.addAll(0,integerList);
        System.out.println("List now "+list);

        List<String> stringList = new ArrayList<>();
        stringList.add("aung aung");
        stringList.add("zaw zaw");
        stringList.add("moe moe");
        System.out.println(stringList);

        list.addAll(0,stringList);
        System.out.println(list);


    }
}
