package Q081_to_Q100.q097;

public class Q097_v2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(5);
        String s="";
        if(sb.equals(s)){
            System.out.println("Match 1");
        }else if(sb.toString().equals(s.toString())){
            System.out.println("Match 2");
        }else{
            System.out.println("No Match");
        }
    }
}
	/*
		/What is the result?
		A. Match 1
		B. Match 2
		C. No Match
		D. A NullPointerException is thrown at runtime.

		Answer: B
		*/
