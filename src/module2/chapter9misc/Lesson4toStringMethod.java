package module2.chapter9misc;

public class Lesson4toStringMethod {
    public static void main(String[] args) {
        C c  = new C();
        System.out.println(c);

        Student std1 = new Student(1,"htet");
        System.out.println(std1);

        Student std2 = new Student(2,"moe");
        System.out.println(std2);
    }
}
class C{
    @Override
    public String toString() {
        return "Class C toStringMethod";
    }
}
class Student{
    int id;
    String name;

    @Override
    public String toString() {
        return "Student " +
                "id=" + id +
                ", name='" + name + '\'';
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}