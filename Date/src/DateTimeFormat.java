import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {

        LocalDateTime ld = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String myDate = dtf.format(ld);
        System.out.println(myDate);
    }
}
