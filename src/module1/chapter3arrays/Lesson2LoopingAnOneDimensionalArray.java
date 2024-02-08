package module1.chapter3arrays;

public class Lesson2LoopingAnOneDimensionalArray {
    public static void main(String[] args) {
        String[] names = {"htet", "Moe", "Aung"};
        int[] numbers = {2, 5, 6, 3, 4, 2, 4, 5, 6, 7, 88, 544, 334};

//        names[0] = names[0].toUpperCase();
//        names[1] = names[1].toUpperCase();
//        names[2] = names[2].toUpperCase();

        //While Loop

//        int a =0;
//        while(a< names.length){
//            names[a] = names[a].toUpperCase();
//            a++;
//        }
//        System.out.println(Arrays.toString(names));

        //ForI

//        for (int i = 0; i < names.length; i++) {
//            names[i] = names[i].toUpperCase();
//        }
//        System.out.println(Arrays.toString(names));

        //ForR Loop

        for (int i = names.length - 1; i >= 0; i--) {
            names[i] = names[i].toLowerCase();
            System.out.print(names[i]+" | ");
        }
    }
    }
