package module2.chapter4oop_basics;

public class Lesson4Fruit {
String name ;
String color ;
String size ;

    public static void main(String[] args) {
        Lesson4Fruit fruit1 = new Lesson4Fruit();
        fruit1.name = "Apple";
        fruit1.color = "red";
        fruit1.size = "small";

        System.out.println(fruit1.name);
        System.out.println(fruit1.color);
        System.out.println(fruit1.size);

        Lesson4Fruit fruit2= new Lesson4Fruit();
        fruit2.name = "banana";
        fruit2.color = "yellow";
        fruit2.size = "small";

        System.out.println(fruit2.name);
        System.out.println(fruit2.color);
        System.out.println(fruit2.size);
    }

}
