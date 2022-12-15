package Q201_to_Q223.Q213;

abstract class Toy {
    int price;
    //line n1

    public static void insertToy(){
        /* code goes here */
    }
//    final Toy getToy(){
//        return new Toy(); {
//        }
//    }
    //public void printToy();
    public int calculatePrice(){return  price;}
    public abstract int computeDiscount();
}
/*
Which three code fragments are valid at line n1?

A)   public static void insertToy(){

    }
B) final Toy getToy(){
        return new Toy(); {
        }
    }
C) public void printToy();
D) public int calculatePrice(){return  price;}
E) public abstract int computeDiscount();

Answer is : A D and E
 */