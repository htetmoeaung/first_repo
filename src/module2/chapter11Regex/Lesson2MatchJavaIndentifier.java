package module2.chapter11Regex;

import java.util.Scanner;

public class Lesson2MatchJavaIndentifier {
    private static final String VALID_IDENTIFIER_PATTERN = "a\\d{2,5}";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str, reply;
        str = scan.next();
        while (true){
            if (str.equals("STOP"))break;
            if (str.matches(VALID_IDENTIFIER_PATTERN)){
                reply = "Valid java identifier";
            }
            else {
                reply = "Not valid java identifier";
            }
            System.out.println(str+" : "+reply);
        }

    }
}
