package module3.chapter15collections_framework.part3_genric;

public class Lesson2CustomGenric {
    public static void main(String[] args) {
        Generic generic = new Generic();
        generic.add(4);
        generic.add("Hello");

        Object o = generic.get();
        System.out.println(o);

        Generic<Integer> generic1 = new Generic();
        generic1.add(1);
//        generic1.add("Hello");

        Integer int1 = generic1.get();
        System.out.println(int1);

    }
}
class Generic<A>{
    A obj;

    void add(A param){
        this.obj = param;
    }

    A get(){
        return obj;
    }
}
