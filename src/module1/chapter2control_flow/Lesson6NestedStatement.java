package module1.chapter2control_flow;

public class Lesson6NestedStatement {
    public static void main(String[] args) {
        int a = 21, b=32, c=45;

        if (a > b){
            if (a > c){
                System.out.println(a + " is the largest");
            }
            else {
                System.out.println(c + " is the largest");
            }
        }
        else {
            if (b > c){
                System.out.println(b + " is the largest");
            }
            else {
                System.out.println(c + " is the largest");
            }
        }

        // smallest program of three integers

        int x = 16, y = 10, z = 21;
        if (x < y) {
            if (y < z) {
                System.out.println(x + " is the smallest");
            } else {
                System.out.println(y + " is the smallest");
            }
        }
        else {
            if (y < z){
                System.out.println(y+ " is the smallest");
            }
            else {
                System.out.println(z + " is the smallest");
            }
        }
    }
}
