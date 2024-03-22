package module2.chapter9misc;

import java.awt.*;

public class Lesson11Enums {
    enum Numbers{ONE,TWO,THREE}
    public static void main(String[] args) {
        Colors[] colors = Colors.values();
        for (Colors color : colors){
            System.out.print(color+" ");

            Colors color1 = Colors.Blue;
            System.out.println("This is a constant object => "+color1);
            System.out.println("ValueOf method result => "+Colors.valueOf("Red"));
            System.out.println("Name method result => "+ Colors.valueOf("Green").name());

            System.out.println("ordinal method result => "+Colors.valueOf("Blue").ordinal());
        }
    }
}

enum Colors{
    Red,Green,Blue;
}
