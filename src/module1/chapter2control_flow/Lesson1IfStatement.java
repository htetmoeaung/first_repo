package module1.chapter2control_flow;

public class Lesson1IfStatement {
    public static void main(String[] args) {
        String mood = "horny";
        if (mood == "horny"){
            System.out.println("I will masturbate");
        }
        else {
            System.out.println("I will not masturbate");
        }

        int num = 19;
        if(num >= 18){
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }

        int c = 10;
        if(c>10){
            System.out.println(c + " is greater than 10");
        }
        else if(c<10){
            System.out.println(c + " is less than 10");
        }
        else {
            System.out.println(c + " is equal to 10");
        }

        String mood1 = "";
        if(mood1=="happy"){
            System.out.println("I will go out with my friends");
        } else if (mood1 == "sad") {
            System.out.println("I will stay home");
        } else if (mood == "love") {
            System.out.println("I will watch anime");
        } else if (mood1 == "depress") {
            System.out.println("I will eat snacks and drinks");
        } else if (mood1 == "angry") {
            System.out.println("I will go out somewhere alone");
        }
        else {
            System.out.println("I will play game");
        }

        // Exam Points System

        int points1 = 0;
        if (points1 >= 80){
            System.out.println("Score: A");
        } else if (points1 >= 60) {
            System.out.println("Score: B");
        }
        else if (points1 >= 40) {
            System.out.println("Score: C");
        }
        else if (points1 < 40) {
            System.out.println("Score: D");
        }
    }
}
