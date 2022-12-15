package Q001_to_Q020.q013;

    class Vehicle2{
        int x;
        Vehicle2(){
            this(10);//line n1
        }
        Vehicle2(int x){
            this.x=x;
        }
    }


    public class Car2 extends Vehicle2 {
        int y;

        Car2() {
            super(10);
        }

        Car2(int y) {
            super(y); //line n2
            this.y = y;
        }

        public String toString() {
            return super.x + ":" + this.y;
        }

        public static void main(String[] args) {

            Vehicle2 y = new Car2();
            System.out.println(y);


        }
    }
//result:10:0
/*
if we remove to String method we got like new_version.first_50.q013.Car2@6d03e736
 */
