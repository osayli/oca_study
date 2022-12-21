package Q021_to_Q040.q025;

public class Q025_v2 {
    public static void main(String[] args) {
        int nums1[]=new int[7];
        int nums2[]={1,2,3,4,5};
        nums1=nums2;
        for(int x:nums2){
            System.out.print(x+":");
        }
    }
}
//What is the result?
//A. 1:2:3:4:5:
//B.	1:2:3:
//C.	Compilation fails.
//D.	An ArrayOutOfBoundsException is thrown at runtime.
//A answer