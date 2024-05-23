package module3.chapter19date_time.current_date_time;

import java.util.Date;

public class Lesson5 {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();

        Date date = new Date(millis);
        System.out.println(date);
    }
}
