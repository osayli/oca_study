package Q181_to_Q200.Q200;

import java.util.ArrayList;
import java.util.List;

class Patient{
    String name;
    public Patient(String name){
        this.name=name;
    }
}
public class Test {
    public static void main(String[] args) {
        List ps=new ArrayList();
        Patient p2=new Patient("Mike");
        ps.add(p2);

        //insert code here
        int f=ps.indexOf(p2);
        //int f=ps.indexOf(Patient("Mike"));
        //int f=ps.indexOf(new Patient("Mike"));
        //Patient p=new Patient("Mike");
        //int f=ps.indexOf(p);
        if(f>=0){
            System.out.println("Mike Found");
        }
    }
}
/*
Which code fragment, when inserted at line 14, enables the code to print Mike Found?

A) int f=ps.indexOf(p2);
B) int f=ps.indexOf(Patient("Mike"));
C) int f=ps.indexOf(Patient("Mike"));
D) Patient p=new Patient("Mike");
   int f=ps.indexOf(p);

Answer is :A
 */