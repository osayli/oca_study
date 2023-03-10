package Q041_to_Q060.q043;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q043 {
    public static void main(String[] args) {
        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf((String s) -> {
            return s.length() <= 2;
        })) {
       //     System.out.println(s + "removed"); //s causes compilation error
            System.out.println("removed");//if we remove s the result be :removed
        }
    }
}
    //What is the result?
//A.	Compilation fails.
//B.	Hi removed
//C.	An UnsupportedOperationException is thrown at runtime.
//D.	The program compiles, but it prints nothing.
/*
Answer is:A
 */
