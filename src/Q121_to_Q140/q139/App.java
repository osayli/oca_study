package Q121_to_Q140.q139;

public class App {
    static  int count;
    public static void displayMsg(){
        System.out.print("Welcome Visit Count: "+count++);  //line n1
    }

    public static void main(String[] args) {
        App.displayMsg();
        displayMsg();                      //line n2
    }
}
/*
What is the result?
A. Welcome Visit Count:0Welcome Visit Count: 1
B. Compilation fails at line n2.
C. Compilation fails at line n1.
D. Welcome, Visit Count:0 Welcome Visit Count: 0
Answer: C

After fix answer is : A
Welcome Visit Count: 0Welcome Visit Count: 1
 */