package module2.chapter9misc;

/**
 * @since 2024
 * @author htet moe aung
 */
public class Lesson2DocumentationComment {

    // single line


/*    multi
    line        ctrl+shift+/
            comment*/
    // to use /** and hit enter

    /**
     * This is the myMethod I created
     * @param a is the first number
     * @param b is the second number
     * @return the sum of the first and second numbers
     */
    static int myMethod(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {

    }
}

/**
 * this is My class
 */
class MyClass{}
