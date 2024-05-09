package module3.chapter15collections_framework.part5_map;

import java.util.*;

public class Lesson2MapList {
    public static void main(String[] args) {
        /* Map List Syntax
         * List <Map <Key,Value>> listName = new ArrayList<>();
         * */

        List<Map<Object, String>> mapList = new ArrayList<>();

        Map<Object, String> stringMap1 = new HashMap<>();
        stringMap1.put(1, "Kyaw Kyaw");
        stringMap1.put(2, "Kyaw Kyaw23");
        System.out.println(stringMap1);

        mapList.add(stringMap1);
        System.out.println(mapList);

    }
}
