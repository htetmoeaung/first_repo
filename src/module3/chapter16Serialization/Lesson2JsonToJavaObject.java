package module3.chapter16Serialization;

import com.google.gson.Gson;

public class Lesson2JsonToJavaObject {
    public static void main(String[] args) {
        String str = "{\"name\":\"kyaw kyaw\",\"age\":21}";

        Gson gson = new Gson();
        Person person = gson.fromJson(str,Person.class);
        System.out.println(person);
    }
}
