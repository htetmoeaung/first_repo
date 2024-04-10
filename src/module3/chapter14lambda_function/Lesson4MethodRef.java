package module3.chapter14lambda_function;
interface Show {
    void display();
}
public class Lesson4MethodRef {
    void fullname(){
        System.out.println("Itadori Yuji");
    }
    void fistName(){
        System.out.println("Itadori");
    }

    public static void main(String[] args) {
        Show show = new Show() {
            @Override
            public void display() {
                System.out.println("yuji");
            }
        };
        show.display();

        Lesson4MethodRef lesson4MethodRef = new Lesson4MethodRef();

        Show show1 = lesson4MethodRef::fullname;
        show1.display();

        Show show2 = () -> lesson4MethodRef.fistName();
        show2.display();

        Show show3 = lesson4MethodRef::fistName;
        show3.display();
    }
}
