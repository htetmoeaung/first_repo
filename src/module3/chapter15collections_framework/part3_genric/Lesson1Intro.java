package module3.chapter15collections_framework.part3_genric;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson1Intro {
    public static void main(String[] args) {
        // without generic, we can store any type of objects
        List list = new ArrayList<>();
        list.add(3);
        list.add("Hello");

        List<Integer> list1 =new ArrayList<>();
        list1.add(1);
//        list1.add("Hello");  //compile time error


        List list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add(21);

        String s = (String) list2.get(0); // type casting
        int int1 = (Integer) list2.get(1);

        // After generic, we don't need to type cast the object.
        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
//        list3.add(32); //compile time error
        String s1 = list3.get(0);
    }
}
