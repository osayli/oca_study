package Q181_to_Q200.q190;

class E1 extends Exception{}
class E2 extends RuntimeException{}

public class App {
    public void m1() throws E1 {
        System.out.println("m1.Accessed.");
        throw new E1();
    }
    public void m2(){
        System.out.println("m2.Accessed.");
        throw new E2();
    }

    public static void main(String[] args) throws E1 {
        int level=1;
        App obj=new App();
        if(level<=5 &&level>=3){
            obj.m1();
        }else{
            obj.m2();
        }
    }
}
/*
Which statement is true?
A. The program prints m1.Accessed.
B. The program fails compile due to the unhandled E1 exception.
C. The program prints m2.Accessed.
D. The program fails to compile due to the unhandled E2 exception.
Answer: B

After fixed(added throws in 2 method where m1() used) answer is:
m2.Accessed but again throw exception
 */