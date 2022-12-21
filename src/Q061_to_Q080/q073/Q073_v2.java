package Q061_to_Q080.q073;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Q073_v2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
        System.out.println("---------------------");
        LocalDateTime dateTime=LocalDateTime.of(2012, 7,23,12,10,34);

        Period p=Period.of(3,2,1);
        dateTime=dateTime.plus(p);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YY-MMM-dd hh:mm:a");
        System.out.println(formatter.format(dateTime));
        System.out.println("----------------------");

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("YYYY-MMMM-dd");
        LocalDate localDate=LocalDate.of(2016,07,15);
        System.out.println(dateTimeFormatter.format(localDate));

    }
}
