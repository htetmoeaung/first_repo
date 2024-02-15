package module2.chapter4oop_basics;

public class Lesson16InitializerBlock {

    Lesson16InitializerBlock(){
        System.out.println("This is constructor");
    }

    //instance initializer block
    {
        System.out.println("This is instance initializer block");
    }

    //static initializer block
    static {
        System.out.println("This is static initializer block");
    }
    public static void main(String[] args) {
        Lesson16InitializerBlock obj = new Lesson16InitializerBlock();
    }
}

//Initializer Block

//Instance
//Static
