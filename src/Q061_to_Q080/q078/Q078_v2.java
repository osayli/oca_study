package Q061_to_Q080.q078;

public class Q078_v2 {
    public static void main(String[] args) {
        String str1="Java";
        String str3="Java";

        boolean b1=(str1.equals(str3));
        boolean b2=(str1==str3);
        System.out.println(b1+" "+b2);

        System.out.println("----------------");
        String s1=new String("Java");
        String s2="Java";

        boolean b3=(s1.equals(s2));
        boolean b4=(s1==s2);
        System.out.println(b3+" "+b4);

        System.out.println("----------------");
        String s3=new String("Java");

        boolean b5=(s3.equals("Java"));
        boolean b6=(s3=="Java");
        System.out.println(b5+" "+b6);

        System.out.println("----------------");
        String s4="Java";

        boolean b7=(s4.equals("Java"));
        boolean b8=(s4=="Java");
        System.out.println(b7+" "+b8);
    }
}
/**
 * What is the result?
 A. false, false
 B. false, true
 C. true, false
 D. true, true
 */

/*
Answer is :
true true
----------------
true false
----------------
true false
----------------
true true
 */