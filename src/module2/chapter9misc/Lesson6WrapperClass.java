package module2.chapter9misc;

public class Lesson6WrapperClass {
    public static void main(String[] args) {

        Byte byt = 4;
        Short shot = 5;
        Integer integer = 6;
        Long lon = 5L;

        Float fl = 4.5f;
        Double dou = 4.535;

        Boolean boo = true;
        Character cha = 'a';
        String string = "htet";

        /**
         * Autoboxing => Java 5 Feature
         */
        int a = 5;
        Integer c = a; // auto boxing
        int b = c; // unboxing

        String data = "123";
        int intNumber = Integer.parseInt(data);

        int number = 34;
        String result1 = String.valueOf(number);
        String result2 = Integer.toString(number);
    }
}
