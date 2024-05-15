package module3.chapter16Serialization;

import com.google.gson.Gson;

public class Lesson2Homework {
    public static void main(String[] args) {
        Rating rate = new Rating(4.5,10);
        Product product = new Product(1,"apple",4.99,"delicious food","Food","https://apple.com",rate);

        Gson gson = new Gson();
        String product1 = gson.toJson(product);

        System.out.println("Java to Json ");
        System.out.println(product1);

        System.out.println();

        String str = "{\"id\":1,\"title\":\"apple\",\"price\":4.99,\"description\":\"delicious food\",\"category\":\"Food\",\"image\":\"https://apple.com\",\"rating\":{\"rating\":4.5,\"count\":10}}";
        Product product2 = gson.fromJson(str,Product.class);
        System.out.println("Json to Java Object ");
        System.out.println(product2);
    }
}
