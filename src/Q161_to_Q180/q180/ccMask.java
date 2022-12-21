package Q161_to_Q180.q180;

public class ccMask {

    public static String maskCC(String creditCard){
        String x="XXXX-XXXX-XXXX-";
        //line n1
        //A
       /* StringBuilder sb=new StringBuilder(creditCard);
        sb.substring(15,19);
        return x+sb;*/
        //B
       // return x+creditCard.substring(15,19);
        //C
       /* StringBuilder sb=new StringBuilder(x);
        sb.append(creditCard,15,19);
        return sb.toString();*/
        //D
    /*    StringBuilder sb=new StringBuilder(creditCard);
        StringBuilder s=sb.insert(0,x);
        return s.toString();*/
        //E  I added this one
        StringBuilder sb=new StringBuilder(creditCard);
        StringBuilder s=sb.replace(0,15,x);
        return s.toString();

    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}
/*
You must ensure that the maskcc method returns a string
 that hides all digits of the credit card number except
the four last digits (and the hyphens that separate each
 group of four digits).
Which two code fragments should you use at line n1,
 independently, to achieve this requirement? (Choose
two.)

Answer is B C AND E

B
 return x+creditCard.substring(15,19);
C
StringBuilder sb=new StringBuilder(x);
sb.append(creditCard,15,19);
 return sb.toString();

E  I added this one
StringBuilder sb=new StringBuilder(creditCard);
StringBuilder s=sb.replace(0,15,x);
return s.toString();
 */