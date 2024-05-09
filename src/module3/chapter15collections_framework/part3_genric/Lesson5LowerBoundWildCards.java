package module3.chapter15collections_framework.part3_genric;

import java.util.Arrays;
import java.util.List;

public class Lesson5LowerBoundWildCards {

    /** Lower Bound Wild Card Syntax

      methodName (List <? super childClass> listName)

     * */


    static void show1(List<? super Honda> list){
        for (Object o : list){
            System.out.println(o);
        }
        System.out.println();
    };

    static void addNumber(List<? super Integer> list){
        for (Object o : list){
            System.out.println(o);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3);
        System.out.println("Displaying the integer");
        addNumber(l1);

    }
}
