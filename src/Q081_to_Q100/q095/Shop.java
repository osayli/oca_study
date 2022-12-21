package Q081_to_Q100.q095;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;

    Product(int id, String name){
        this.id=id;
        this.name=name;
    }
}
public class Shop {

    public static void main(String[] args) {
        //1st is not correct variable name so I changed it to st
        List<Product> st=new ArrayList<>();
        st.add(new Product(10,"IceCream"));
        st.add(new Product(11,"Chocolate"));
        Product p1=new Product(10,"IceCream");
        System.out.println(st.indexOf(p1));

        st.add(p1);
        System.out.println(st.indexOf(p1));//2

        System.out.println(st.indexOf(new Product(10, "IceCream")));
        System.out.println(st.indexOf(new Product(11, "Chocolate")));
    }
}

/*
 *What is the result?
		A. true
		B. false
		C. -1
		D. 0
		Answer: C
 */