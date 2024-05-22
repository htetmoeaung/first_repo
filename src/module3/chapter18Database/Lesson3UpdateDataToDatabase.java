package module3.chapter18Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static module3.chapter18Database.MyProjectUtil.*;

public class Lesson3UpdateDataToDatabase {
    private static void update(){
        try {
            Connection connection = DriverManager.getConnection(URL,USERNAME,"");
            Statement statement = connection.createStatement();

            statement.executeUpdate("update student set student_name='luffy taro' where student_id=3");

            System.out.println("success");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        update();
    }
}
