package module3.chapter18Database;

import java.sql.*;

public class Lesson1SelectDataFromDatabase {
    static void getData(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jse27db","root","");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            String str = "";
            while (resultSet.next()){
                str = str.concat("id is "+resultSet.getInt("student_id")+"\t"+"name is "+resultSet.getString("student_name")+" "+"age is "+resultSet.getInt("age")+"\n");
            }
            System.out.println(str);

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        getData();
    }
}
