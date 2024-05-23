package module3.chapter18Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static module3.chapter18Database.MyProjectUtil.URL;
import static module3.chapter18Database.MyProjectUtil.USERNAME;

public class Lesson6UpdateDataByUserinput {

    static void update(){
        try {
            Scanner scan = new Scanner(System.in);
            Connection connection = DriverManager.getConnection(URL,USERNAME,"");
            Statement statement = connection.createStatement();

            System.out.print("Enter id : ");
            int id = scan.nextInt();

            System.out.print("Enter new name : ");
            String userInputName = new Scanner(System.in).nextLine();

            System.out.print("Enter new age : ");
            int userInputAge = scan.nextInt();

            statement.executeUpdate("update student set student_name='"+userInputName+"' where student_id="+id);
            statement.executeUpdate("update student set age="+userInputAge+" where student_id="+id);

            System.out.println("success");
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        update();
    }
}
