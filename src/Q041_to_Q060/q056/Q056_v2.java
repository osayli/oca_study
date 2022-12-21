package Q041_to_Q060.q056;

public class Q056_v2 {
    public static void main(String[] args) {
        String str=" ";// there is white space , not empty
        str=str.trim(); // it is not assigned to string, no affect
        System.out.println(str.equals("")+" "+str.isEmpty());
    }
}
//What is the result?
//A.	true true
//B.	true false
//C.	false false
//D.	false true

/*
Answer is A
 */
