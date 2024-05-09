package module3.chapter15collections_framework.part3_genric;

import java.util.ArrayList;
import java.util.List;

public class Lesson6UnboundWildCards {
    /* Unbound Wild Cards Syntax

       methodName(List<?> listName)
     */

    static void show(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
    };

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car());
        carList.add(new Car());
        show(carList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        show(integerList);
    }
}
