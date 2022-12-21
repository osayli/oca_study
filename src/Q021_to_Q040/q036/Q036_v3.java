package Q021_to_Q040.q036;

public class Q036_v3 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            if(arr[i].equals("C")){
                break;
            }
            System.out.println("Work Done");
            continue;
        }
    }
}
//What is the result?
//A.	A B C Work done
//B.	A B C D Work done
//C.	A Work done
//D.	Compilation fails

/*Answer is :A Work Done
             B Work Done
             C
*/
