package Q061_to_Q080.q061;

public class Q061 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.print("Standard for loop reverse entry : ");
        for (int i =array.length-1; i >=0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Standard for loop order of  entry : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Standard for loop alternating elements in the order of  entry : ");
        for (int i = 0; i < array.length; i=i+2) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Enhanced for loop order of  entry : ");
        for (int a:array) {
            System.out.print(a+" ");
        }
        System.out.println();
    }

}
/**
 * And given the requirements:
 * 1. Process all the elements of the array in the reverse order of entry.
 * 2. Process all the elements of the array in the order of entry.
 * 3. Process alternating elements of the array in the order of entry. Which two statements are true? (Choose two.)

 A. Requirements 1, 2, and 3 can be implemented by using the enhanced for loop.
 B. Requirements 1, 2, and 3 can be implemented by using the standard for loop.
 C. Requirements 2 and 3 CANNOT be implemented by using the standard for loop.
 D. Requirement 2 can be implemented by using the enhanced for loop.
 E. Requirement 3 CANNOT be implemented by using either the enhanced for loop or the standard for loop.
 */
//Answer: B and D