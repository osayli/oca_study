package Q121_to_Q140.q122;

public class Q122 {

    public static void main(String[] args) {
        Short s1=200;
        Integer s2=400;
        //String s3=(String)(s1+s2);   //line n1
        String s3=String.valueOf(s1+s2);
        System.out.println("Sum is :"+s3);
        Long s4=(long)s1+s2;         //line n2
        System.out.println("Sum is :"+s4);
    }
}
/*
What is the result?
A. Sum is 600
B. Compilation fails at line n1.
C. Compilation fails at line n2.
D. A ClassCastException is thrown at line n1.
E. A ClassCastException is thrown at line n2.
Answer: B

After fix answer is:
Sum is :600
Sum is :600
 */