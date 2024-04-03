package module2.chapter12Exception.handling;

public class NoError {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;

        try {
            int result = a/b;
            System.out.println(result);
        }catch (Exception e){

        }


    }
}
