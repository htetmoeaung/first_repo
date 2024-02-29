package module2.chapter6polymorphism;

import java.util.Scanner;

public class Lesson3MethodOverloadingExe {
    static void transfer(String phnum, int amount){
        System.out.println("You transferred "+amount+" to "+phnum);
    }
    static void transfer(String phnum, int amount, String note){
        System.out.println("You transferred "+amount+" to "+phnum);
        System.out.println("Your Note : "+note);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the phone number : ");
        String userphnum = scan.nextLine();
        System.out.print("Enter amount : ");
        int useramount = scan.nextInt();
        System.out.println("Enter Note : ");
        String usernote = scan.nextLine();

        if (usernote==""){
            transfer(userphnum,useramount);
        }
        else {
            transfer(userphnum,useramount,usernote);
        }


    }
    }