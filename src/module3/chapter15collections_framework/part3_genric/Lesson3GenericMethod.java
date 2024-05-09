package module3.chapter15collections_framework.part3_genric;

import java.util.ArrayList;
import java.util.List;

public class Lesson3GenericMethod {
    /*
    Type Parameters

    T - Type
    E - Element
    K - Key
    N - Number
    V - Value

     */
    static void show(int[] numbers){
        for (int number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println();
    }
    static<E> void show1(E[] numbers){
        for (E number : numbers) {
            System.out.print(number+" ");
        }
        System.out.println();
    }
    static void show2(List<Integer> list){
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }
    static void show3(List list){
        for (Object object : list) {
            System.out.print(object+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        Double[] doubles = {1.1,1.5,2.0};
        int[] arr = {1,2,3,45};

        List list = new ArrayList();
        list.add(2);
        list.add("Hello");

        List list1 = new ArrayList();
        list1.add(13);
        list1.add(25);


//        show(arr);
//        show(doubles);

//        show1(numbers);
//        show1(doubles);

        show1(numbers);
        show1(doubles);

//        show3(list);
//        show3(list1);
    }
}
