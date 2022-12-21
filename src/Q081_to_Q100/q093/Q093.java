package Q081_to_Q100.q093;

public class Q093 {
    public static void main(String[] args) {
        Product p1=new Product(101,"Pen");
        Product p2=new Product(101,"Pen");
        Product p3=p1;

        boolean ans1=p1==p2;
        boolean ans2=p1.name.equals(p2.name);

        System.out.println(ans1+" "+ans2);

        System.out.println("-------------------");

        System.out.println(p3==p1);//true

    }
}
/*
	 * What is the result?
		A. true:true
		B. true:false
		C. false:true
		D. false:false

		Answer: C
	 */