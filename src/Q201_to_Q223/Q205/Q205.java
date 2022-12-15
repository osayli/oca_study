package Q201_to_Q223.Q205;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Q205 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);

        LocalDate date1=LocalDate.of(2012, Month.JANUARY,30);
        date1.plusDays(10);
        System.out.println(date1);

    }
}
/*
What is the result? A. 2012-02-10
B. 2012-01-30
C. 2012-02-10 00:00
D. A DateTimeException is thrown at runtime.
Answer: B
 */