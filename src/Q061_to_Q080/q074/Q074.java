package Q061_to_Q080.q074;

public class Q074 {

    void readCard(int cardNo) throws Exception{//exception looks both run-time and compile-time
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException{  //line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) throws Exception {
        Q074 ex=new Q074();
        int cardNo=12344;
        ex.readCard(cardNo);   //line n2
        ex.checkCard(cardNo); //line n3
    }
}
/*
Answer is: compilation fails at line n2
*/