package Q021_to_Q040.q021;
class Vehicle{
    Vehicle(){
        System.out.println("Vehicle");
    }
}
class Bus extends Vehicle{
    Bus(){
        System.out.println("Bus");
    }
}


public class Transport {
    public static void main(String[] args) {
        Vehicle v=new Bus();
    }
}
//What is the result?
//A.	Vehicle
//		Bus
//B.	Bus
//		Vehicle
//C.	Bus
//D.	The program doesn’t print anything
//Answer is:A