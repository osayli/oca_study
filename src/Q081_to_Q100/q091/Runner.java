package Q081_to_Q100.q091;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Animal> myList =new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Hunter> myList1 =new ArrayList<>();
        myList1.add(new Cat());

        ArrayList<Hunter> myList2 =new ArrayList<>();
        myList2.add(new Tiger());

//        ArrayList<Tiger> myList =new ArrayList<>();
//        myList.add(new Cat());

        ArrayList<Animal> myList4 =new ArrayList<>();
        myList4.add(new Cat());

    }
}
/*

      Which answer fails to compile?

     A) ArrayList<Animal> myList=new ArrayList<>();
        myList.add(new Tiger());

     B) ArrayList<Hunter>   myList=new ArrayList<>();
     myList.add(new Cat());

     C)ArrayList<Hunter>myList=new ArrayList<>();
        myList.add(new Tiger());

      D)ArrayList<Tiger> myList=new ArrayList<>();
       myList.add(new Cat());

      E)ArrayList<Animal>myList=new ArrayList<>();
        myList.add(new Cat());

        Answer is:  D
 */