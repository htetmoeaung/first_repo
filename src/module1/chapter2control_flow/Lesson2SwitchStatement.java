package module1.chapter2control_flow;

public class Lesson2SwitchStatement {
    public static void main(String[] args) {
        String day = "Thursday";
        switch (day){
            case "Monday" :
                System.out.println("I will do to gym");break;
            case "Tueday" :
                System.out.println("I will do to gym");break;
            case "Wednesday" :
                System.out.println("Zoom Meeting");break;
            case "Thursday" :
                System.out.println("Zoom Meeting Again");break;
            case "Friday" :
                System.out.println("Let play games");break;
            default:
                System.out.println("I will play game");
        }
    }
}
