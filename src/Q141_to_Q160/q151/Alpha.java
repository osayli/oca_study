package Q141_to_Q160.q151;

public class Alpha {
    int ns;
    static int s;

    Alpha(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;
        }
    }
    void doPrint(){
        System.out.println("ns= "+ns+" s= "+s);
    }
}
