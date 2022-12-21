package Q161_to_Q180.q179;

public class Test_2 {
    static int count=0;
    static int i=0;

    public void changeCount(){
        while (i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {
        Test_2 check1=new Test_2();
        Test_2 check2=new Test_2();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count+":"+check2.count);
    }
}
/*
What is the result?
A. 5 : 5
B. 10 : 10
C. 5 : 10
D. Compilation fails.

Answer: A
 */
