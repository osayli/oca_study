package Q121_to_Q140.q140;
public class Q140 {
    public static void main(String[] args) {
        int iVar=100;
        float fVar=100.100f;
        double dVar=123;
        fVar=iVar;
        //iVar=fVar;
        //fVar=dVar;
        dVar=fVar;
        //iVar=dVar;
        dVar=iVar;
    }
}
/*
Which three lines fail to compile? (Choose three.)
A. Line 7
B. Line 8
C. Line 9
D. Line 10
E. Line 11
F. Line 12
Answer: B C E
 */