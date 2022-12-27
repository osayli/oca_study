package Q161_to_Q180.q169.clothing.pants;

//line n1


//import static new_version.Q161ToQ180.q169.clothing.Shirt.getColor;

import Q161_to_Q180.q169.clothing.Shirt;

public class Jeans {
    public void matchShirt(){
        //line n2
        String color = Shirt.getColor();
        //String color =getColor();
        if(color.equals("Green")){
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser=new Jeans();
        trouser.matchShirt();
    }
}
/*
Which two sets of actions, independently, enable the code fragment to print Fit?
A. At line n1 insert: import clothing.Shirt;At line n2 insert: String color = Shirt.getColor();
B. At line n1 insert: import clothing;At line n2 insert: String color = Shirt.getColor();
C. At line n1 insert: import static clothing.Shirt.getColor;At line n2 insert: String color = getColor();
D. At line n1 no changes required.At line n2 insert: String color = Shirt.getColor();
E. At line n1 insert: import Shirt;At line n2 insert: String color = Shirt.getColor();
Answer: A or C
 */