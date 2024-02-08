package module1.chapter3arrays;

import java.util.Arrays;

public class Lesson4ATwoDimensionalArray {
    public static void main(String[] args) {
        int []numbers = {10,20,30};
        int number1[][] = {
                {1,2,3,4,5,6,7},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(number1[0][3]);
        number1[0][4] = 16;

        System.out.println(number1[2].length);

        System.out.println(Arrays.toString(number1[0]));

        System.out.println("Length are");
        System.out.println(number1.length); // row count
        System.out.println(number1[0].length); // column count

        //using for i loop

        for (int a =0; a<number1.length; a++){ //row
            for (int b=0; b<number1[a].length; b++){ //column
                System.out.print(number1[a][b]+"\t");
            }
            System.out.println();
        }

        //using for loop

        for (int[] ints : number1) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
