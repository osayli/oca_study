
package Q001_to_Q020.q003;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3_V2 {
    public static void main(String[] args) {
        String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);
        System.out.println("----------------");
        String date2= LocalDate.parse("2014-05-04").format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date2);
        System.out.println("----------------");
        String date3= String.valueOf(LocalDate.now());
        System.out.println(date3);
    }
    /*
   2014-05-04
   ----------------
   20140504
   ----------------
   2022-09-13
     */
}
