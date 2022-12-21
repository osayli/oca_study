package Q141_to_Q160.q151;

public class TestAlpha {
    public static void main(String[] args) {
        Alpha ref1=new Alpha(100);
        Alpha ref2=new Alpha(50);
        Alpha ref3=new Alpha(125);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();

    }
}
/**
 * 		//What is the result?
 * A. ns = 100 s =125
 ns = 0 s = 125
 ns = 125 s = 125

 B. ns = 50 s = 50
 ns = 125 s = 125
 ns = 0 s = 125

 C. ns = 50 s = 125 ns = 125 s = 125
 ns = 0 s = 125

 D. ns = 50 s = 50 ns = 125 s =125
 ns = 100 s =100

 Answer: A
 */