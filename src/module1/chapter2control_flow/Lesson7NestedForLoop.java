package module1.chapter2control_flow;

public class Lesson7NestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){     //row
            for (int j =0; j<=i; j++){   //column
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int c = 5; c <10; c++){
            for (int d = 10; d > c; d--){
                System.out.print("*\t");
            }
            System.out.println();
        }

//        System.out.println();

        for (int a = 1; a <= 5; a++){       //row
            for (int b = 5; b > a; b--){
                System.out.print("\t");    //column for space
            }
            for (int c=1; c<=a; c++){       //column for *
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int g=1; g<=5; g++) {
            for (int h = 1; h < g; h++) {
                System.out.print("\t");
            }
            for (int i = 5; i >= g; i--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
