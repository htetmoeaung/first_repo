package module2.chapter9misc;

import java.util.Objects;

public class Lesson5equalAndhashcode {
    public static void main(String[] args) {
        User user = new User(1,"htet");
        User user1 = new User(1,"htet");

        System.out.println(user);
        System.out.println(user1);

        System.out.println(user.hashCode());
        System.out.println(user1.hashCode());
    }
}
class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
