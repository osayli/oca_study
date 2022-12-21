package Q081_to_Q100.q087;

import static new_version.Q081ToQ100.q087.MarkList.graceMarks;

public class Q087 {
    public static void main(String[] args) {
        MarkList obj1=new MarkList();
        MarkList obj2=obj1;
        MarkList obj3=null;
        obj2.num=60;
        graceMarks(obj2);
 //   System.out.println(obj2);
//        System.out.println(obj2.num);
//        System.out.println(obj1.num);
//        System.out.println(obj3.num);
    }
}
/*
    How many MarkList instances are created in memory at runtime?
    A. 1
    B. 2
    C. 3
    D. 4
    Answer: A
     */