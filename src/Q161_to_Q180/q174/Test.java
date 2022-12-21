package Q161_to_Q180.q174;


class MyString {
    String msg;
    MyString(String msg){
        this.msg=msg;
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello "+new StringBuilder("Java SE 8"));
        System.out.println("Hello "+new MyString("Java SE 8").msg);
    }
}
/*
    What is the result?
    A
    Hello Java SE 8
    Hello Java SE 8

    B
    Hello java.lang.StringBuilder@<<hashcode1>>
    Hello Q49_60.Q57.MyString@<<hashcode1>>

    C
    Hello Java SE 8
    Hello Q49_60.Q57.MyString@<<hashcode1>>

    D
    Compilation fails at the Test class

    A. Option A
    B. Option B
    C. Option C
    D. Option D
    Answer: C
*/

/*
 Answer: C
Hello Java SE 8
Hello Java SE 8
 */