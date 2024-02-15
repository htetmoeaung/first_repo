package module2.chapter4oop_basics;

public class Lesson14ObjectInitializationByCons {
    public static void main(String[] args) {
        Student roll1 = new Student("Aung", 18, "Male");
        Student roll2 = new Student("Kyaw", 21, "Gay");

        roll1.show();
        roll2.show();
    }
}

class Student{
    String name;
    int age;
    String gender;

    Student(String nm, int ag, String gd){
        name = nm;
        age = ag;
        gender = gd;
    }

    void show(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Gender : "+gender);
    }
}
