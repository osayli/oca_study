package Q121_to_Q140.q131;
class Vehicle{
    int x;
    Vehicle(){
        this(10);        //line n1
    }
    Vehicle(int x){
        this.x=x;
    }
}
class Car extends Vehicle {
    int y;
    Car(){
      //  super();
        this(20);        //line n2
    }
    Car(int y){
        this.y=y;
    }
    public  String toString(){
        return super.x+":"+this.y;
    }

    public static void main(String[] args) {
        Vehicle y=new Car();
        System.out.println(y);
    }
}
/*
What is the result?
A. 10:20
B. 0:20
C. Compilation fails at line n1
D. Compilation fails at line n2

Answer is:D

After fix answer is: A ->10:20
 */