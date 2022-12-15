package Q001_to_Q020.q016;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q016_v3 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.parse("2014-07-31T00:00:00.000");
        LocalDate dt2= LocalDate.parse("2014-07-31");
        dt.plusDays(30);  // not assigned to dt, no effects on dt
        dt.plusMonths(1);// not assigned to dt, no effects on dt
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dt2.format(DateTimeFormatter.ISO_DATE));
        //System.out.println(dt2.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
/*
2014-07-31
2014-07-31T00:00:00
2014-07-31
 */