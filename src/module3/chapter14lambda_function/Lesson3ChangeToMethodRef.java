package module3.chapter14lambda_function;

interface Writeable{
    void show (String name);
}
public class Lesson3ChangeToMethodRef {
    public static void main(String[] args) {
        Writeable writeable = new Writeable() {
            @Override
            public void show(String name) {
                System.out.println();
            }
        };

        Writeable writeable1 = name -> System.out.println(name.toUpperCase());
        writeable1.show("htet");

        Writeable writeable2 = System.out::println;
        writeable2.show("moe");
    }
}
