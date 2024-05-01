package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Lesson5Reduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);

        Optional<Integer> optionalInteger = list
                .stream()
                .reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        });

        int result = optionalInteger.get();
        System.out.println(result);

        Optional<Integer> integerOptional = list.stream().reduce(Integer::sum); // :: => method reference
        int result1 = integerOptional.get();
        System.out.println(result1);

        int result2 = list.stream().reduce(Integer::sum).get();
        System.out.println(result2);
    }
}
