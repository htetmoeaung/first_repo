package module3.chapter15collections_framework.part4_set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lesson2HashSetEx {
    public static void main(String[] args) {
        /* Set syntax
          Set<Generic type> setName = new HashSet<>();
         */
        Set<String> stringSet = new HashSet<>();
        stringSet.add("One");
        stringSet.add("Two");
        stringSet.add("Three");
        stringSet.add("Two");
        stringSet.add("Three");
        stringSet.add("Six");
        stringSet.add("Money");
        stringSet.add("Apple");
        System.out.println(stringSet);

         /* Hashset syntax
          Hashset<Generic type> setName = new HashSet<>();
          sorting
         */

        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(3);
        System.out.println(integerSet);
    }
}
