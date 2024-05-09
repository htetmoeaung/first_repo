package module3.chapter15collections_framework.part3_genric;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson4UpperBoundWildCard {

    /*
     ? - this is a wild card
     */
    static void show(List<? extends Car> list){
        for (Car car : list) {
            System.out.println(car+" ");
        }
        System.out.println();
    };

    static double add(ArrayList<? extends Number> num){
        double sum = 0.0;

        for (Number number : num) {
            sum = sum +number.doubleValue();
        }
        return sum;
    };
    public static void main(String[] args) {
        List<Car> carList = new ArrayList();
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());
        carList.add(new Car());

        List<Toyota> toyotas = new ArrayList<>();
        toyotas.add(new Toyota());
        toyotas.add(new Toyota());
        toyotas.add(new Toyota());
        toyotas.add(new Toyota());

        List<Honda> hondas = new ArrayList<>();
        hondas.add(new Honda());
        hondas.add(new Honda());
        hondas.add(new Honda());
        hondas.add(new Honda());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        add(integers);



    }
}
