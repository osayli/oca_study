package Q021_to_Q040.q022;

public class Q022 {
    public static void main(String[] args) {
        int ans;
        try{
          int num =10;
          int div=0;
          ans=num/div;
        }catch(ArithmeticException ae){
            ans=0;             //line n1
        }catch(Exception e){
            System.out.println("Invalid calculation");
        }
        //System.out.println("Answer= "+ ans);  //line n2
    }
}
//What is the result?
//A.	Answer = 0
//B.	Invalid calculation
//C.	Compilation fails only at line n1.
//D.	Compilation fails only at line n2.
//E.	Compilation fails at line n1 and line2.

//Answer is:D