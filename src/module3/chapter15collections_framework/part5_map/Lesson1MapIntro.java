package module3.chapter15collections_framework.part5_map;

import java.util.HashMap;
import java.util.Map;

public class Lesson1MapIntro {
    public static void main(String[] args) {
        /* Map Syntax
         * Map <Key,Value> mapName = new HashMap<>();
         * */

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("one", "Kyaw Kyaw");
        stringMap.put("two", "Kyaw Kyaw23");
        System.out.println(stringMap);
        System.out.println(stringMap.get("one"));

        System.out.println();

        Map<Integer, String> stringMap1 = new HashMap<>();
        stringMap1.put(12, "Kyaw Kyaw");
        stringMap1.put(2, "Kyaw Kyaw23");
        System.out.println(stringMap1);
        System.out.println(stringMap1.get(2));
    }
}
