package Q001_to_Q020.q017;

public class Test2 {
    int x,y;
    public Test2(int x,int y){
        initialize(x,y);
    }
    public void initialize(int x,int y){
        this.x=x*x;
        this.y=y*y;
    }

    public static void main(String[] args) {
        int x=3,y=5;
        Test2 obj=new Test2(x,y);
        System.out.println(obj.x+" "+obj.y);
    }
}
//What is the result?
//A.	Compilation fails.
//B.	3 5
//C.	0 0
//D.	9 25
//Answer is: D