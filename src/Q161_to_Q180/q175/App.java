package Q161_to_Q180.q175;

public class App {
 //int foe;
  static int foe;
 static int bar;
 static void process(){
     foe+=10;
     bar+=10;
 }

    public static void main(String[] args) {
        App firstObj=new App();
        App.process();
        System.out.println(firstObj.bar);

        App secondObj=new App();
        App.process();
        System.out.println(secondObj.bar);
    }
}
/*
What is the result?
A. 10
* 20
B. A compile-time error occurs
C. 20
*20
D. 10 *10
Answer: B

After fix answer is:A
10
20
 */
//because foe is not static and cannot be used inside static method