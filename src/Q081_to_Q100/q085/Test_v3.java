package Q081_to_Q100.q085;

public class Test_v3 {

    public static void main(String[] args) {
        try{
            method1();
        }
        catch(MyException ne){
            System.out.println("A");
        }
    }
    public static void method1(){ //line n1
        try{
            throw Math.random()>0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException re){
            System.out.println("B");
        }
    }
}

//What is the result?
//A. A
//B. AB
//C. A compile-time error occurs at line n1.
//D. B
//E. I
// Answer: D
