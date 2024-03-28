package module2.chapter11Regex;

public class Lesson1Boundary {
    public static void main(String[] args) {
        String std = "temporary";
        String  mod;

        mod = std.replaceAll("\\btemp\\b","temporary");
        System.out.println(mod);
    }
}