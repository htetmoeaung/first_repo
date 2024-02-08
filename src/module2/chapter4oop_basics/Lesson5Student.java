package module2.chapter4oop_basics;

public class Lesson5Student {
    int id;
    String name;
    int age;

    static String schoolName = "CodeWall";

    public static void main(String[] args) {
        Lesson5Student student1 = new Lesson5Student();
        student1.id = 1;
        student1.name= "Htet";
        student1.age = 15;

        System.out.println(student1.id);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.schoolName);


        Lesson5Student student2 = new Lesson5Student();
        student2.id = 1;
        student2.name= "Htet";
        student2.age = 15;

        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.schoolName);



    }
}
