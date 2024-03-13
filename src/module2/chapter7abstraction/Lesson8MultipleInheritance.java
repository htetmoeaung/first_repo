package module2.chapter7abstraction;

interface I1 {
    void doing ();
}

interface I2{
    void done();
}

interface I3{
    void test();
}

class Use implements I1,I2,I3{

    @Override
    public void doing() {
        System.out.println("1");
    }

    @Override
    public void done() {
        System.out.println("2");
    }

    @Override
    public void test() {
        System.out.println(3);
    }
}
public class Lesson8MultipleInheritance {
    public static void main(String[] args) {
        Use obj = new Use();
        obj.doing();
        obj.done();
        obj.test();
    }


}
