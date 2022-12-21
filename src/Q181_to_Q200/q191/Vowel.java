package Q181_to_Q200.q191;

public class Vowel {
    private char var;

    public static void main(String[] args) {
        char var1='a';
        char var2=var1;
        var2='e';

        Vowel obj1=new Vowel();
        Vowel obj2=obj1;
        obj1.var='o';
        obj2.var='i';
        System.out.print(var1+", "+var2);
        System.out.print(obj1.var+","+obj2.var);
    }
}
/*
* What is the result?
* A. a, ei, i
B. a, eo, o
C. e, ei, i
D. a, ao, o
*
*
* Answer: A
* */