package module1.chapter1the_basics.essentials;

public class Lesson5DataTypes {
    public static void main(String[] args) {

        byte num1= 127;
        short num2 = -32768;
        int num3 = 1000000000;
        long num4 = 123456789098L;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        float num6 = 7.245f;
        double num7 = 758.257933179;

        System.out.println(num6);
        System.out.println(num7);

        char character1= 'X';
        System.out.println(character1);
        char character3 = '&';
        System.out.println(character3);
        char character2 = 98; // 98 = b //ASCII Table
        System.out.println(character2);

        boolean answer1 = true;
        boolean answer2 = false;

 /* 1. Primitive Data Type

           0,1 => bits => byte [1 byte = 8 bits]
               1. byte    1 byte (2^8-1 = 2^7 = -128 <> 127)
               2. short   2 byte (2^16-1 = 2^15 = -32768 <> 32767)
               3. int     4 byte
               4. long    8 byte

               5. float    4 byte
               6. double   8 byte

               7. boolean          true 1, false 0  => 1 bits

               8. char              'c','X','*'

           2.Non-Primitive Data Type
             String, Array, Enum, Class, Interface

           binary => 2 => 1 byte => 0000 0000 => 1111 1111
           decimal => 10

           octal => 7
           hexadecimal => 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
         */

    }
}
