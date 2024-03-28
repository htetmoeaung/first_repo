package module2.chapter10string;

public class Lesson1CreateString {
    public static void main(String[] args) {
        String name = "htet";
        String test = "htet";

        String name1 = new String("Hte Moe Aung");

        char[] chars = {'h','t','e','t'};
        String name2 = new String(chars);

        System.out.println(name2);
    }
}
