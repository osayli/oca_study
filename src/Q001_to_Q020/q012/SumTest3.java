package Q001_to_Q020.q012;

public class SumTest3 {

    public static void doSum(Integer x,Integer y){
        System.out.println("Integer sum is "+(x+y));
    }
    public static void doSum(double x,double y){
        System.out.println("double sum is "+(x+y));
    }

    public static void doSum(Float x,Float y){
        System.out.println("Float sum is "+(x+y));
    }

    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
        /*
        Answer:
        double sum is 30.0
        double sum is 30.0
         */
    }
}
