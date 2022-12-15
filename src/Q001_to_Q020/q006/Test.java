package Q001_to_Q020.q006;

import java.io.IOException;

class X {
    public void printFileContent() throws IOException {
        /* code goes here  */
        throw new IOException();
    }
}


public  class  Test{
    public static void main(String[] args) throws IOException {
        X xobj=new X();
        xobj.printFileContent();
    }
}
