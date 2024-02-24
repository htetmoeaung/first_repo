package module2.chapter5inheritance;

public class Lesson6Aggregation {
    public static void main(String[] args) {
        Info htetinfo = new Info(1, "htet", 19);
        Address htetaddress = new Address("Yesagyo", 169);

        Student1 obj = new Student1(htetinfo, htetaddress);
        obj.show();
    }
}
class Info{
    int id;
    String name;
    int age;

    public Info(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Address{
    String city;
    int houseNumber;
    public Address(String city, int houseNumber){
        this.city = city;
        this.houseNumber = houseNumber;
    }
}
class Student1{
    Info info1;
    Address address1;

    public Student1(Info info,Address address){
        this.address1 = address;
        this.info1 = info;
    }

    void show(){
        System.out.println(info1.id);
        System.out.println(info1.name);
        System.out.println(info1.age);

        System.out.println(address1.city);
        System.out.println(address1.houseNumber);
    }
}
