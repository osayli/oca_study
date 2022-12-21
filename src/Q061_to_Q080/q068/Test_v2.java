package Q061_to_Q080.q068;

import java.io.IOException;

public class Test_v2 {

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
            throw Math.random()>0.5 ? new MyException() : new IOException();
        }
        catch (IOException ie){
            System.out.println("I");
        }
        catch (Exception re){
            System.out.println("B");
        }
    }
}

//What is the result?

// Answer: I or B randomly
