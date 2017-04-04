import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by latashawatson on 3/22/17.
 */
public class GivenDateProvideDayOfWeek {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String month = "08";
        String day = "05";
        String year = "2015";

        String stringDay = year + month + day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date d = null;
        try {
            d = sdf.parse(stringDay);
        } catch (Exception e) {
        }

        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String[] weekDays = new String[8];
        weekDays[0] = "";
        weekDays[1] = "SUNDAY";
        weekDays[2] = "MONDAY";
        weekDays[3] = "TUESDAY";
        weekDays[4] = "WEDNESDAY";
        weekDays[5] = "THURSDAY";
        weekDays[6] = "FRIDAY";
        weekDays[7] = "SATURDAY";
        System.out.println(weekDays[dayOfWeek]);
    }
}



