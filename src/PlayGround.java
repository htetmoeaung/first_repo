import module1.chapter3arrays.RandomNumber;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PlayGround {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner scan = new Scanner(System.in);

//        int correctNum = num.nextInt(1,4);
//        System.out.println("Guess The Number Game Test");
//        System.out.print("Guess = ");
////        int answer = scan.nextInt();
//        for (int a = scan.nextInt(); a != correctNum;){
//            System.out.print("Guess = ");
//            for (int b = scan.nextInt(); b > correctNum; ){
//                System.out.println("Your Number is larger than the correct number");
//            }
//            System.out.print("Guess = ");
//            for (int c = scan.nextInt(); c < correctNum;){
//                System.out.println("Your Number is smaller than the correct number");
//            }
//            System.out.print("Guess = ");
//            for (int d = scan.nextInt(); d == correctNum; ){
//                System.out.println("your number is correct");
//            }
//        }
//        // Primitive Data Type
//        byte a = 127;
//        short b = 32767;
//        int c = 2147483647;
//        long d = 123456789012L;
//
//        float e = 3.1247f;
//        double f = 3.1427;
//
//        boolean answer = true;
//        char g = 'X';
//
//        //Non-Primitive Data Type
//        String h = "Hello World 123";
//
//        int a = 5;
//        int b = 6;
//        if (a>b){
//            System.out.println(a+" is greater than "+b);
//        }
//        else {
//            System.out.println(b+" is greater than "+a);
//        }
//
//        // if statement with userinput
//
//        int x = 10;
//        int y = 7;
//        int z = 15;
//        if ( x > y){
//             if (x > z) {
//                System.out.println(x+" is the largest number");
//        }
//             else {
//                 System.out.println(z+" is the largest number");
//             }
//        }
//        else {
//            if (y > z ){
//                System.out.println(y+" is the largest number");
//            }
//            else {
//                System.out.println(z+" is the largest number");
//            }
//        }

//
//        System.out.print("Enter Your Exam Score = ");
//        int scores = scan.nextInt();
//        if (scores == 100){
//            System.out.println("Your score is A+");
//        } else if (scores >=80 ) {
//            System.out.println("Your score is A");
//        }
//        else if (scores >=60 ) {
//            System.out.println("Your score is B");
//        }
//        else if (scores >=40 ) {
//            System.out.println("Your score is C");
//        }
//        else if (scores <= 40 ) {
//            System.out.println("Your score is D");
//        }

        //Switch Statement with userinput


//        System.out.print("Input the day = ");
//        String today = scan.next();
//        switch (today){
//            case "Mon":
//                System.out.println("Today is " + today);break;
//            case "Tue":
//                System.out.println("Today is " + today);break;
//            case "Wed":
//                System.out.println("Today is " + today);break;
//            case "Thur":
//                System.out.println("Today is " + today);break;
//            case "Fri":
//                System.out.println("Today is " + today);break;
//            case "Sat":
//                System.out.println("Today is " + today);break;
//            case "Sun":
//                System.out.println("Today is "+ today);break;
//        }

        //While Statement
//        int i = 5;
//        while (i>=0){
//            System.out.print(i+"\t");
//            i--;
//        }
//        System.out.println();
//
//        //do while statemnet
//        int l = 5;
//        do {
//            System.out.println("this is 5");
//        }
//        while (l>10);
//
//        //for i loop
//        for (int g = 0; g <= 5; g++) {
//            System.out.print(g+"\t");
//        }
//        System.out.println();
//        //for i loop
//        for (int j = 5; j >= 0; j--) {
//            System.out.print(j+"\t");
//        }

        System.out.println();

        // triangle shape
//        for (int n = 0; n<=5; n++){
//            for (int m = 0; m < n; m++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for (int n = 0; n<=5; n++){
//            for (int m = 5; m > n; m--) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//        for (int n = 1; n<=5; n++){
//            for (int m = 5; m > n; m--) {
//                System.out.print("\t");
//            }
//            for (int o= 1; o<=n; o++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int n = 1; n<=5; n++){
//            for (int o= 1; o<n; o++){
//                System.out.print("\t");
//            }
//            for (int m = 5; m >= n; m--) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

        //Arrays
//        System.out.print("Enter the index of the array = ");
//        int arrayIndices = scan.nextInt();;
//        int[] luckyNumbers = new int[arrayIndices];
//
//        for (int a = 0; a<=luckyNumbers.length-1; a++){
//            System.out.print("Enter the value = ");
//            int numbers = scan.nextInt();
//            luckyNumbers[a] = numbers;
//        }
//        System.out.println(Arrays.toString(luckyNumbers));


//        String[][] studentNames = new String[2][2];
//
//        studentNames[0][0] = "Ma";
//        studentNames[0][1] = "Hla";
//
//        studentNames[1][0] = "Ma";
//        studentNames[1][1] = "Hlaing";
//
//        for (String[] studentName : studentNames) {
//           for (String name : studentName){
//               System.out.print(name+"\t");
//           }
//            System.out.print(" ");
//        }
//        System.out.println();
//
//        for (int r = 0; r < studentNames.length; r++) {
//            for (int c = 0; c < studentNames[r].length; c++) {
//                System.out.print(studentNames[r][c]+"\t");
//            }
//        }
        System.out.print("Enter the total of the students : ");
        String[][] studentsResults = new String[scan.nextInt()][2];

        for (int r = 0; r < studentsResults.length; r++) {
            for (int c = 0; c < studentsResults[r].length; c++) {
                System.out.print("Name : ");
                String names = scan.next();
                studentsResults[r][0] = names;

                System.out.print("Grade : ");
                String grades = scan.next();
                studentsResults[r][1]= grades;
            }
        }
        for (String[] studentsResult : studentsResults) {
            for (String results : studentsResult){
                System.out.print(results+"\t");
            }
        }









    }
}
