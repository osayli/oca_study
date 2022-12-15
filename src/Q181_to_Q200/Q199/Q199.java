package Q181_to_Q200.Q199;

public class Q199 {
    public static void main(String[] args) {
        String stuff="TV";
        String res=null;

        if(stuff.equals("TV")){
            res="Walter";
        }else if (stuff.equals("Movie")){
            res="White";
        }else{
            res="No Result";
        }

        //stuff.equals("TV") ? res="Walter" : stuff.equals("Movie") ? res="White" : res="No Respond";
        //res=stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" :"No Respond";
        //res=stuff.equals("TV") ?  stuff.equals("Movie") ? "White" :"Walter" :No Respond";
        res=stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" :"No Respond";
    }
}
/*
Which code fragment can replace the if block?

A)  stuff.equals("TV") ? res="Walter" : stuff.equals("Movie") ? res="White" : res="No Respond";
B)  res=stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" :"No Respond";
C)  res=stuff.equals("TV") ?  stuff.equals("Movie") ? "White" :"Walter" :No Respond";
D)  res=stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White" :"No Respond";

Answer: D
 */