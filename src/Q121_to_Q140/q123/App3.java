package Q121_to_Q140.q123;

public class App3 {

    String myStr="9009";
    int myNum=20;

    public void doStuff(String str){
        int myNum=0;
        String myStr=str;
        try{
            myNum=Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("myStr: "+myStr+", myNum: "+myNum);
    }

    public static void main(String[] args) {
        App3 obj=new App3();
        obj.doStuff("7007");
    }
}
/*
What is the result?
A. myStr: 7007, myNum: 7007
B.Error
C. myStr: 9009, myNum: 7007
D. myStr: 7007, myNum: 9009

Answer: A
myStr: 7007, myNum: 7007
 */
