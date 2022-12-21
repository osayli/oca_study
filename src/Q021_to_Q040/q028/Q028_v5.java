package Q021_to_Q040.q028;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028_v5 {
    public static void main(String[] args) {
        String[] arr={"Hi","How","Are","You"};
        List<String> arrList=new ArrayList<>(Arrays.asList(arr));
        arrList.removeIf( s->s.length()<=2);
        arrList.add("Osman");
            System.out.println(arrList);
        }
    }
//[How, Are, You, Osman]