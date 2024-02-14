package module2.chapter4oop_basics;

public class Lesson12ObjectInitiByMethod {
    public static void main(String[] args) {

        new car().insert(121, "Audi"); //Anonymous Object
        car car2 = new car();
        car2.insert(123, "Porsche");

        car2.show();
    }
}
class car{
    int id;
    String name;

    void insert(int i,String n){
        id = i;
        name = n;
    }
    void show(){
        System.out.println("My car id : "+id+"\n Name : "+name);
    }
}
