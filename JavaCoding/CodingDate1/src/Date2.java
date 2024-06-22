import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date2 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate :- " + ld);

        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime :- " + lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime :- " + ldt);

        Clock c = Clock.systemDefaultZone();
        System.out.println("clock : " + c.getZone());
    }
}
