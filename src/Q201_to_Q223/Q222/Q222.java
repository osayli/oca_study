package Q201_to_Q223.Q222;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q222 {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("EN","FR","CH","JP");
        Iterator<String> itr=lst.iterator();
        while(itr.hasNext())  {
            String e=itr.next();
            if(e=="CH"){
                break;
            }
            System.out.print(e+ " ");
        }
    }

}
/*
What is the result?
A. EN FR JP
B. EN FR
C. CH
D. EN FR CH Answer: B
 */