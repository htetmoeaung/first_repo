package module3.chapter15collections_framework.part4_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Lesson3ListToSet {
    public static void main(String[] args) {
        /* List To Set Syntax
         *
         * Set<Generic Type> setName = new HashSet<>(arrayListName);
         *
         * */
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(211);
        integerArrayList.add(211);
        integerArrayList.add(11);
        integerArrayList.add(21);
        System.out.println(integerArrayList);

        Set<Integer> integerSet = new HashSet<>(integerArrayList);
        System.out.println(integerSet);

    }
}
