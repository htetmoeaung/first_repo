package module3.chapter15collections_framework.part1_list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    String name;
    int points;

    public Person(String name, int points) {
        this.name = name;
        this.points = points;
    }
}

public class Lesson8SortingPeople {
    public static void main(String[] args) {
        Person person1 = new Person("htet",40);
        Person person2 = new Person("htet moe",40);
        Person person3 = new Person("aung aung",10);
        Person person4 = new Person("luffy",20);
        Person person5 = new Person("ma ma",30);
        Person person6 = new Person("maung",20);
        Person person7 = new Person("It",60);

        List<Person> personList = Arrays.asList(person1,person2,person3,person4,person5,person6,person7);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.points<o2.points) return 1;

                if (o1.points == o2.points) return o1.name.compareTo(o2.name);

                return -1;
            }
        });

        Collections.sort(personList, (o1, o2) -> {
            if (o1.points>o2.points) return -1;
            else if (o1.points == o2.points) {
                return o1.name.compareTo(o2.name);
            } else {
                return 1;
            }
        });


        personList.sort((o1, o2) -> {
            if (o1.points>o2.points) return -1;
            else if (o1.points == o2.points) {
                return o1.name.compareTo(o2.name);
            } else {
                return 1;
            }
        });

        for (Person person : personList){
            System.out.println(person.points + " " + person.name);
        }
    }
}
