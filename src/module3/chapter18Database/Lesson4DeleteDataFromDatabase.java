package module3.chapter18Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static module3.chapter18Database.MyProjectUtil.*;

public class Lesson4DeleteDataFromDatabase {
    public static void main(String[] args) {
        System.out.print("Enter a number you want to delete : ");
        try {
            Connection connection = DriverManager.getConnection(URL,USERNAME,"");
            Statement statement = connection.createStatement();

            int userInput = new Scanner(System.in).nextInt();
            statement.executeUpdate("delete from student where student_id="+userInput);
            System.out.println("success");
        } catch (SQLException e){
            System.out.println(e);
        }
    }
}
