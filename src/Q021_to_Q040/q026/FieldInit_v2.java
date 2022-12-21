package Q021_to_Q040.q026;

public class FieldInit_v2 {

    char c;
    boolean b;
    float f;
    void printAll(){
        System.out.println("c= "+c);
        System.out.println("b= "+b);
        System.out.println("f= "+f);
    }

    public static void main(String[] args) {
        FieldInit_v2 f= new FieldInit_v2();
        f.printAll();
    }
}
//What is the result?
//A. c=null b=true f=0.0
//B. c= b=false f=0.0
//C. c=null b=false f=0.0
//D. c=0 b=false f=0.0F

/*
Answer is:B
c=
b= false
f= 0.0
 */
