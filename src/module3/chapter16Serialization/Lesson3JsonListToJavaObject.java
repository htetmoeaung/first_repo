package module3.chapter16Serialization;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Lesson3JsonListToJavaObject {
    public static void main(String[] args) {
        String str = "[{\"name\":\"kyaw kyaw\",\"age\":21},"+
                " {\"name\":\"aung aung\",\"age\":11}," +
                " {\"name\":\"hlaing hlaing\",\"age\":25},"+
                " {\"name\":\"htet htet\",\"age\":27}]";
        Gson gson = new Gson();
        List<Map<String, Object>> list = gson.fromJson(str, List.class);
        System.out.println(list);
        System.out.println(list.get(1));

        List<Person> personlist = new ArrayList<>();

        for (Map<String, Object> map : list) {
            String name = map.get("name").toString();
            int age = Integer.parseInt(map.get("age").toString());

            Person person = new Person(name, age);
            personlist.add(person);
        }
        System.out.println(personlist);
    }
}
