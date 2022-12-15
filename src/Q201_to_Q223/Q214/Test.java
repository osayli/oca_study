package Q201_to_Q223.Q214;


public class Test {
    public  static  final int MIN=1;

    public static void main(String[] args) {
        int x=args.length;
        for(String s:args){
            System.out.println(Integer.parseInt(s));
        }
        System.out.println(x);
        if(checkLimit(x)){
            System.out.println("Java SE");
        }else{
            System.out.println("Java EE");
        }
    }
    public static boolean checkLimit(int x){
        return (x>=MIN) ? true :false;
    }
}
/*
And given the commands:
javac Test.java
java Test 1

What is the result?
A. Java SE
B. Java EE
C. Compilation fails at line n1.
D. A NullPointerException is thrown at runtime.
Answer: A
 */