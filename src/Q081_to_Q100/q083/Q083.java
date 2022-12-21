package Q081_to_Q100.q083;

public class Q083 {
    public static void main(String[] args) {
        Q083 ts=new Q083();
        System.out.print(isAvailable +" ");
        isAvailable=ts.doStuff();
        System.out.println(isAvailable);
    }
    public static boolean doStuff(){
        return !isAvailable;
    }
    static boolean isAvailable=true;
}
	/*
	What is the result?
	A.	Compilation fails.
	B.	false true
	C.	true false
	D.	true true
	E.	false false

	Answer: C
	 */