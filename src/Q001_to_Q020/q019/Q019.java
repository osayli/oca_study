package Q001_to_Q020.q019;

public class Q019 {

    private Q019(){
        System.out.println("private constructor");
    }
    private Q019(String str){
        System.out.println(str);
    }
    /*
    2. Which three statements are true about the structure of a Java class? (Choose three.)
A. A class cannot have the same name as its field.
B.	A public class must have a main method.
C.	A class can have final static methods.
D.	A class can have overloaded private constructors.
E.	Fields need to be initialized before use.
F.	Methods and fields are optional components of a class.

correct answer is C,D and F

     */
    static String name;
    boolean answer;
    int Q019=12;//A class cannot have the same name as its field is wrong

    public static void main(String[] args) {
        //	A public class must have a main method is false, because it can be but not must.
        System.out.println(add(23,23,45));
        Q019 Q019 =new Q019();
        Q019 q3=new Q019("Osman");
        //Fields need to be initialized before use is false
        System.out.println(Q019.answer);
        System.out.println(name);
    }
//A class can have final static methods is true
    public static final int add(int... a){
        int sum=0;
        for(int w:a){
            sum+=w;
        }
        return sum;
    }
}
