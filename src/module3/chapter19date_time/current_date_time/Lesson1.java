package module3.chapter19date_time.current_date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lesson1 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
