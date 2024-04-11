package module3.chapter15collections_framework.part1_list;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson1ListIntro {
    public static void main(String[] args) {

        // we can't add new data to this array
        int number[] = new int[5];
        number[0] = 1;

        // we can't add other data types
        int number2[] = {1,2,3,4,5};
        number2[2] = 10;
//        number2[3] = "htet";

        //we can't get the data with single force
        System.out.println(number2);

        Object object[] = {1,"htet",true,'x'};

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("htet");
        list.add(3.14);

        List arrlist = new ArrayList();

        Object t = list.get(1);
        Integer int1 = (Integer) t;

        System.out.println(list);
        System.out.println();

        List<Integer> list2 = Arrays.asList(1,2,3,4);
        list2.set(0,10);

        System.out.println(list2);
    }
}
