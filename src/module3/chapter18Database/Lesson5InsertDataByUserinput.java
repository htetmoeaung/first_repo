package module3.chapter18Database;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static module3.chapter18Database.MyProjectUtil.*;

public class Lesson5InsertDataByUserinput {
    static void insert() {
        try {
            Scanner scan = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(URL, USERNAME, "");
            Statement statement = connection.createStatement();
            System.out.print("Enter name : ");
            String name1 = scan.nextLine();

            System.out.print("Enter age : ");
            int age1 = scan.nextInt();

            statement.executeUpdate("INSERT INTO student(student_name,age) VALUES('"+name1+"','"+age1+"')");
            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        insert();
    }
}

