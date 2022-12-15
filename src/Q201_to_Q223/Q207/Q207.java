package Q201_to_Q223.Q207;

public class Q207 {

    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        for(int[] a:arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }


        for(int[] a:arr){
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
/*
What is the result?
A. 1 3 5 7
   1 3
B. 1 3
   1 3
C. 1 3
   1 3 0 0
D. 1 3followed by an ArrayIndexOutOfBoundsException
E. Compilation fails.
Answer: B
 */