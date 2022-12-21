package Q121_to_Q140.q132;

import java.util.Arrays;

public class Q132_v2 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];
        System.out.println(Arrays.deepToString(arr));
        //arr[0][0]=1;
       arr[0]= new int[]{1, 3, 5, 7};
       // arr[0]={1, 3, 5, 7};
//        for (int i = 0; i < arr[0].length; i++) {
//            arr[0][i]=i;
//       }
        System.out.println(Arrays.deepToString(arr));
        arr[1]= new int[]{1, 3, 5, 6, 7, 90};
        System.out.println(Arrays.deepToString(arr));
        for(int []a: arr){
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
/**
 What is the result?
 A. Compilation fails
 B. 1 3
 1 3
 C. 1 3
 Followed by an ArrayIndexOutOfBoundsException
 D. 1 3
 1 3 0 0
 E. 1 3 5 7
 1 3

 A. Option A
 B. Option B
 C. Option C
 D. Option D
 E. Option E

 Answer: even I put more than size it works.
 1 3 5 7
 1 3 5 6 7 90

 */
