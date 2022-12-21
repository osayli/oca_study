package Q021_to_Q040.q036;

public class Q036_v2 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            if(arr[i].equals("A")){
                continue;
            }
            System.out.println("Work Done");
            break;
        }
    }
}
//What is the result?
//A.	A B C Work done
//B.	A B C D Work done
//C.	A Work done
//D.	Compilation fails

//Answer is :A B Work Done