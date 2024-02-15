package module2.chapter4oop_basics;

public class Lesson15ThisKeyword {
    public static void main(String[] args) {
        Student1 roll1 = new Student1(1, "htet", 150000);
        roll1.show();

        Student1 roll2 = new Student1(2, "moe", 300000);
        roll2.show();

    }
}

class Student1{
    int id;
    String name;
    double fees;

    Student1(int id, String name, double fees){

        //this => current instance, current object
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    void show(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.fees);
    }

}
