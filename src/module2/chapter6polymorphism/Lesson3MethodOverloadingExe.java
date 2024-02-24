package module2.chapter6polymorphism;

import java.util.Scanner;

public class Lesson3MethodOverloadingExe {
    static Scanner scan = new Scanner(System.in);

    static double storedphonenumber;
    static double storedamount;
//    static void transferData(double phoneNumber, double amount){
//        storedphonenumber = phoneNumber;
//        storedamount = amount;
//
//    }
    static void Note () {
        System.out.println("You have transferred "+storedamount+" MMk to "+storedphonenumber);
    }

    static void Note(String notes) {
        System.out.println("You have transferred "+storedamount+" MMk to "+storedphonenumber);
        System.out.println("Your notes : " + notes);
    }
        public static void main(String[] args) {
            System.out.print("Enter the phone number : ");
            double phnum = scan.nextDouble();
            System.out.print("Enter amount : ");
            double amount1 = scan.nextDouble();

//            transferData(phnum, amount1);

            storedphonenumber = phnum;
            storedamount = amount1;

            scan.nextLine();

            System.out.print("Enter note : ");
            String note1 = scan.nextLine().trim();
            if (note1.isEmpty()){
                Note();
            }
            else {
                Note(note1);
            }


        }
    }