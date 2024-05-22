package module3.chapter18Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Lesson2InsertDataIntoDatabase {
    static void inset() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jse27db", "root", "");
            Statement statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO student (student_name,age) VALUES ('Myat Thu Ko',35)");
            System.out.println("success");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        inset();
    }
}
