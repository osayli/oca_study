package Q021_to_Q040.q028;

import java.util.Arrays;
import java.util.List;

public class Q028_v6 {
    public static void main(String[] args) {
        String[] arr={"Hi","How","Are","You"};
        List<String> arrList=Arrays.asList(arr);
        if(arrList.removeIf(s->{System.out.print(s); return s.length()<=2;})){
            System.out.println(" removed");
        }
    }
}
//UnsupportedOperationException: remove