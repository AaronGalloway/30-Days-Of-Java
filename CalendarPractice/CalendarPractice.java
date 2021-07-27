package CalendarPractice;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalendarPractice {
    
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 125);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
