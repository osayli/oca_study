package Q201_to_Q223.Q210;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {
        Predicate<Integer> p=(n)->n%2==0;
        //insert code here
//        Boolean s=p.apply(101);
//        System.out.println(s);
        Boolean s=p.test(100);
        System.out.println(s);

//        Integer s=p.test(100);
//        if(s==1){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
//        }
//        System.out.println(p.apply(100));


    }
}
/*
Which code snippet at line 9 prints true?
A) Boolean s=p.apply(101);
   System.out.println(s);
B) Boolean s=p.test(100);
   System.out.println(s);
C) Integer s=p.test(100);
        if(s==1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
D) System.out.println(p.apply(100));

 */