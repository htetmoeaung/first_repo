package module3.chapter19date_time.current_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Lesson2 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }
}
