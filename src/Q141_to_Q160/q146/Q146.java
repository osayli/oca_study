package Q141_to_Q160.q146;

import java.util.Arrays;

public class Q146 {

    public static void main(String[] args) {
        String[] strs=new String[2];
        int idx=0;
        for(String s:strs){
            /* we can not concat if array is null */
            strs[idx].concat("element"+idx);
            idx++;
        }
        for (idx  = 0; idx <strs.length ; idx++) {
            System.out.println(strs[idx]);

        }
    }
}
/*
What is the result?
A. Element 0Element 1
B. Null element 0Null element 1
C. NullNull
D. A NullPointerException is thrown at runtime.

Answer is D
 */