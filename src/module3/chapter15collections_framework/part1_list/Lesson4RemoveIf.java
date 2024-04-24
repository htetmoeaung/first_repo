package module3.chapter15collections_framework.part1_list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Lesson4RemoveIf {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mg Htet");
        names.add("Mg Kaung");
        names.add("Mg Aung");
        names.add("Ma Kaung");
        names.add("Ma Hlaing");
        names.add("Ma Lwin");
        names.add("U Gyi");
        System.out.println(names);

        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.startsWith("Mg")) return true;
                return false;
            }
        });

        names.removeIf(s -> {
            if (s.startsWith("Ma")) return true;
            return false;
        });

        names.removeIf(s -> s.startsWith("Mg"));

        System.out.println(names);
    }
}
