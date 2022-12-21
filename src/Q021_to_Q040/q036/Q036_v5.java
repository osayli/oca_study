package Q021_to_Q040.q036;

public class Q036_v5 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            if(arr[i].equals("A")){
                break;
            }
            System.out.println("Work Done");
            break;
        }
    }
}

/*
Answer is :A
 */
