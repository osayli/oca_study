package Q081_to_Q100.q092;

public class Q092 {
    public static void main(String[] args) {
      //line n1
      //byte x=1;
      //short x=1;
     Integer x=new Integer("1");
     /*
Constructs a newly allocated Integer object that represents the int value
 indicated by the String parameter. The string is converted to an int value
 in exactly the manner used by the parseInt method for radix 10.
Deprecated
It is rarely appropriate to use this constructor. Use parseInt(String) to convert a string to an int primitive, or use valueOf(String) to convert a string to an Integer object.
Params:
s – the String to be converted to an Integer.
Throws:
NumberFormatException – if the String does not contain a parsable integer.

      */
      switch (x){
          case 1:
              System.out.println("One");
              break;
          case 2:
              System.out.println("Two");
              break;
      }
    }
}
//CIBSS  ==> Char, Integer, Byte, String, Short can be used in switch
// Boolean, long, float, double we can not use with switch

/*
*Which three code fragments can be independently inserted at line n1 to enable the code to print One?
(Choose three.)
A. byte x = 1;
B. short x = 1;
C. String x = "1";
D. long x = 1;
E. double x = 1;
F. Integer x = new Integer("1");
Answer: ABF
*  */