package module1.chapter3arrays;

public class Lesson5LoopingTwoDimensionalArray {
    public static void main(String[] args) {
        String[][] stdnames = new String[3][2];
        stdnames[0][0] = "Mg";
        stdnames[0][1] = "Aung";

        stdnames[1][0] = "Ko ";
        stdnames[1][1] = "Khant";

        stdnames[2][0] = "Ma";
        stdnames[2][1] = "Hla";

        //for r output

        for (int r = stdnames.length-1; r>=0; r--){
            for (int c=0; c<stdnames[r].length; c++){
                System.out.print(stdnames[r][c]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (String[] stdname : stdnames) {
            for (String name : stdname) {
                System.out.print(name.toUpperCase()+"\t");
            }
            System.out.println();
        }
    }
}
