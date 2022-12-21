package Q161_to_Q180.q165;

public class Q164 {
    public static void main(String[] args) {
        String s1="Moon";
        OraString s2=new OraString("Moon");
        System.out.println(s2.toString());

        if((s1=="Moon")&&(s2.equals("Moon"))){
            System.out.print("A");
        }else{
            System.out.print("B");
        }

        if(s1.equalsIgnoreCase(s2.s)){
            System.out.print("C");
        }else{
            System.out.println("D");
        }
    }
}
/*
What is the result?
A. AC
B. BD
C. BC
D. AD
Answer: C
 */