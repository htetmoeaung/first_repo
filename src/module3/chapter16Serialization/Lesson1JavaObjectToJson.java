package module3.chapter16Serialization;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

public class Lesson1JavaObjectToJson {
    public static void main(String[] args) {
        Person obj = new Person("kyaw kyaw",21);
        Person obj1 = new Person("aung aung",11);
        Person obj2 = new Person("hlaing hlaing",25);
        Person obj3 = new Person("htet htet",27);
        List<Person> people = Arrays.asList(obj,obj1,obj2,obj3);
        System.out.println(people);

        System.out.println("===========");
        Gson gson = new Gson();
        String str = gson.toJson(people);
        System.out.println(str);


    }
}
