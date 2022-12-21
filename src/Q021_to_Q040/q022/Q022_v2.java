package Q021_to_Q040.q022;

public class Q022_v2 {
    public static void main(String[] args) {
        int ans;
        try{
            int num =10;
            int div=0;
            ans=num/div;
        }catch(ArithmeticException ae){
            ans=10;             //line n1
        }
        System.out.println("Answer= "+ ans);  //line n2
    }
}
//What is the result?
//A.	Answer = 10
//B.	Invalid calculation
//C.	Compilation fails only at line n1.
//D.	Compilation fails only at line n2.
//E.	Compilation fails at line n1 and line2.

//Answer is:A