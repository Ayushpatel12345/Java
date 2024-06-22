import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender1 {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("Calender type : " + c.getCalendarType());
        System.out.println("Calender get time : " + c.getTime());

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("isLeapYear : " + cal.isLeapYear(2020));
        System.out.println("getTimeZone : " + cal.getTimeZone());
    }
}
