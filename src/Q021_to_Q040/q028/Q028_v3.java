package Q021_to_Q040.q028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028_v3 {
    public static void main(String[] args) {
        String[] arr={"Hi","How","Are","You"};
        List<String> arrList=new ArrayList<>(Arrays.asList(arr));
        if(arrList.removeIf(s->{return s.length()<=2;})){
            System.out.println(" removed");
        }
    }
}
