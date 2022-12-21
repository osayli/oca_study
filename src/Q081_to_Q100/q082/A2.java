package Q081_to_Q100.q082;


class Alpha2{

   static int ns;
    int s;

    Alpha2(int ns){
        if(s<ns){
            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = "+ns+" s = "+s);
    }
}
class TestA2 {
    public static void main(String[] args) {
        Alpha2 ref1 = new Alpha2(50);
        Alpha2 ref2 = new Alpha2(100);
        Alpha2 ref3 = new Alpha2(125);

        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}
/*
Answer is:
ns = 125   s = 50
ns = 125  s = 100
ns = 125  s = 125
 */