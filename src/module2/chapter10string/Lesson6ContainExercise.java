package module2.chapter10string;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson6ContainExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] food = {"meat", "chicken", "steak", "ham", "roast-beef", "turkey", "pork chop", "ribs", "bacon", "sausage"};
        System.out.println(Arrays.toString(food));
        System.out.print("Search : ");
        String input = scan.nextLine();

        for (String s : food){
            if (s.contains(input)){
                System.out.print(s+" ");
            }
        }

    }
}
