package Q061_to_Q080.q079;

class C{
    public C(){
        System.out.print("C ");
    }
}

class B extends C{        //line n1
    public B(){
        System.out.print("B ");
    }
}

public class A extends B{
    public A(){             //line n2
        System.out.print("A ");
    }

    public static void main(String[] args) {
        A a=new A();
    }
}
 /*
    What is the result?
    A. C B A
    B. C
    C. A B C
    D. Compilation fails at line n1 and line n2
    Answer: A

     */