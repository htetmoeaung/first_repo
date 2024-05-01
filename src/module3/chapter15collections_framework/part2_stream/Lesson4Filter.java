package module3.chapter15collections_framework.part2_stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson4Filter {
    public static void main(String[] args) {
        Person person1 = new Person("htet htet", 19);
        Person person2 = new Person("zaw zaw", 21);
        Person person3 = new Person("ma ma", 23);
        Person person4 = new Person("kyaw kyaw", 18);
        Person person5 = new Person("moe moe", 24);
        Person person6 = new Person("aung aung", 25);
        Person person7 = new Person("hla hla", 26);

        List<Person> personList = Arrays.asList(person1,
                person2,
                person3,
                person4,
                person5,
                person6,
                person7
        );

        personList
                .stream()
                .filter(person -> person.age > 18)
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        if (o1.age > o2.age) return -1;
                        return 1;
                    }

                })
                .forEach(person -> System.out.println(person.name + " " + person.age));

    }
}
