package Q001_to_Q020.q001;

public class Test {
    public static void main(String[] args) {
        int x=1;
        int y=1;
        if(x++<++y){
            System.out.print("Hello ");
        }else{
            System.out.print("Welcome ");
        }
        System.out.print("Log"+x+":"+y);
    }
}
/*
Answer:
Hello Log2:2
 */
