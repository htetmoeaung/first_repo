package module3.chapter15collections_framework.part1_list;

import java.util.*;

public class Lesson7Sorting {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(1);
        integers.add(5);
        integers.add(8);
        integers.add(7);
        integers.add(9);
        integers.add(3);
        integers.add(7);
        integers.add(6);
        integers.add(10);
        System.out.println(integers);

        Collections.sort(integers);
        System.out.println(integers);

        System.out.println("==========");

        Collections.reverse(integers);
        System.out.println(integers);

        System.out.println("==========");

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)return -1;
                return 1;
            }
        });
        System.out.println(integers);

        System.out.println("==========");

        // -1 not change // 1 change

        Collections.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2)return -1;
                return 1;
            }
        });
        System.out.println(integers);

        Collections.sort(integers, ((o1, o2) -> {
            if (o1>o2)return -1;
            return 1;
        }));
        System.out.println(integers);

        // 01 small / 02 big

        Collections.sort(integers, ((o1, o2) -> o1.compareTo(o2)));
        System.out.println(integers);

        Collections.sort(integers, ((o1, o2) -> o2.compareTo(o1)));
        System.out.println(integers);

        Collections.sort(integers, Comparator.naturalOrder());
        System.out.println(integers);

        Collections.sort(integers, Comparator.reverseOrder());
        System.out.println(integers);


        //Method reference (big to small)

        Collections.sort(integers, Integer::compareTo);
        System.out.println(integers);
        System.out.println("======");

        integers.sort(Integer::compareTo);
        System.out.println(integers);
        integers.sort(Comparator.reverseOrder());
        System.out.println(integers);

    }
}
