package Q001_to_Q020.q007;

class X {

    static  int i;//static variables get changed for every object
    int j;

    public static void main(String[] args) {
        X x1=new X();
        X x2=new X();
        x1.i=3;
        System.out.println(x1.i);
        System.out.println(x2.i);
        x1.j=4;
        x2.i=5;
        System.out.println(x1.i);
        System.out.println(x2.i);
        x2.j=6;
        System.out.println(x1.i+" "+x1.j+" "+x2.i+" "+x2.j);
    }
}
//What is the result?
//A.-3 4 5 6
//B.3 4 3 6
//C.5 4 5 6
//D.3 6 4 6
//Answer:C