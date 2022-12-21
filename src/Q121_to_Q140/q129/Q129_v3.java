package Q121_to_Q140.q129;

public class Q129_v3 {
    public static void main(String[] args) {
        int ans;
        try{
            int num=10;
            int div=0;
            ans=num/div;
        }catch (ArithmeticException ae){
            ans=0;                            //line n1
        }
        System.out.println("Answer = "+ans);  //line n2
    }
}
/*
What is the result?

B. Invalid calculation
C. Compilation fails only at line n1.
D. Compilation fails only at line n2.
E. Compilation fails at line n1 and line2.

Answer: = 0
 */
