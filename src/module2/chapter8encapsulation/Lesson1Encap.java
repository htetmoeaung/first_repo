package module2.chapter8encapsulation;

public class Lesson1Encap {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(1);
        person.setName("Htet Moe Aung");
        person.setAge(19);

        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
class Person{
    private int id;
    private int age;

    private String name;

//    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0){
            this.id = id;
        }
        else {
            System.out.println("Invalid Id Number");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age > 18){
            this.age = age;
        }
        else{
            System.out.println("Your are not qualified");
        }
    }
}
