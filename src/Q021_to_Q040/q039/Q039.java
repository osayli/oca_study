package Q021_to_Q040.q039;

class Animal{
    String type="Canine";
    int maxSpeed=60;
    Animal(){}
    Animal(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}
class WildAnimal extends Animal{
    String bounds;
    WildAnimal(String bounds){
        //line n1
        super();
        this.bounds=bounds;
    }
    WildAnimal(String type,int maxSpeed,String bounds){
        //line n2
        super(type,maxSpeed);
        this.bounds=bounds;
    }
}
public class Q039 {
    public static void main(String[] args) {
       WildAnimal wolf=new WildAnimal("Long");
       WildAnimal tiger=new WildAnimal("Feline",80,"Short");
        System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);
    }
}
/*
Which two modifications enable the code to print the following output? (Choose Two)
	Canine 60 Long
	Feline 80 Short

A. Replace line n1 with:
	super();
	this.bounds = bounds;

B. Replace line n1 with:
	this.bounds = bounds;
	super (); 							// super() and this() should be the first statement following constructor  --> compilation error

C. Replace line n2 with:
	super(type, maxSpeed);
	this (bounds); 					// super() and this() should be the first statement following constructor  --> compilation error

D. Replace line n1 with:
	this("Canine", 60); 			// should've been defined as this -- ("Canine", 60, bounds);--  to call current class's 3 parameter constructor
	this.bounds = bounds;            //otherwise give compile error

E. Replace line n2 with:
	super(type, maxSpeed);
	this.bounds = bounds;

Answer: A, E
*/