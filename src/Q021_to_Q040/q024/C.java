package Q021_to_Q040.q024;


class A{
    public A(){
        System.out.print("A ");
    }
}

class B extends A {
    public B(){     //line n1
        System.out.print("B ");
    }
}
public class C extends B{
    public  C(){    //line n2
        System.out.print("C ");
    }

    public static void main(String[] args) {
        C c =new C();
    }
}
//What is the result?
//A.	C B A
//B.	C
//C.	A B C
//D.	Compilation fails at line n1 and line n2

//Answer is :C