package Q081_to_Q100.q100.p2;

import new_version.Q081ToQ100.q100.p1.Acc;

public class Test extends Acc {
    public static void main(String[] args) {
        Acc obj=new Test();
        obj.s=1;
        System.out.println(obj.s);
 /*Protected is inheritable to subclass (outside the package) so there for if
 the subclass’ object was created then you could access to the protected variable.
But the object was created from super class*/

        Test obj2=new Test();
        obj2.s=2;
        obj2.r=2;
        System.out.println(obj2.r);
        System.out.println(obj2.s);

        Acc obj3=new Acc();
        obj3.s=3;
        System.out.println(obj3.s);

        Acc obj4 = new Test();
        obj4.s = 4;
        ((Test) obj4).r = 4;
        System.out.println(obj4.s);
        System.out.println(((Test) obj4).r);


        Test obj5 = new Test();
        obj5.s = 5;
        obj5.r = 5;
        System.out.println(obj5.s);
        System.out.println(obj5.r);
    }
}
/**
 Which statement is true?
 A. Both p and s are accessible via obj.
 B. Only s is accessible via obj.
 C. Both r and s are accessible via obj.
 D. p, r, and s are accessible via obj.

 Answer: B


 So, public can be reached from anywhere....
 protected can be reached from the same package,
 and if we need to reach from another package,
 it needs to be extended from parent AND needs to
 create an object from the child class...
 Default only can be reached from same package...
 Private only from same class.


 */