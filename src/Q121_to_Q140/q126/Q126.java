package Q121_to_Q140.q126;

public class Q126 {

    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        int x=array.length;
        /* line n1*/
        while(x>0){
            x--;
            System.out.print(array[x]);
        }
        System.out.println();
        x=array.length;
        do{
            x--;
            System.out.print(array[x]);

        }while (x>0);

        System.out.println();
        x=array.length;
        while(x>0){
            System.out.print(array[--x]);
        }
    }
}
//A.
//	while (x>0) {
//	x--;  //Decrement oldugu icin reverse print ediyor
//			System.out.print(array[x]);
//		}

//B.
//	do {
//	x--;
//	System.out.print(array[x]);//ArrayIndexOutOfBoundsException
//			            //Index -1 out of bounds for length 5
//	}while (x>=0);


//C.
//	 while (x>0) {    // ArrayIndexOutOfBoundsException
 //            System.out.print(array[x]);
//		Index 5 out of bounds for   length 5
//             x--;
//             }

//D.

//	do {
//	System.out.print(array[x]);// rrayIndexOutOfBoundsException
//	--x;                   //Index 5 out of bounds for length 5
//	}while (x>=0);
//

//E.

//		while (x > 0) {
//			System.out.print(array[--x]);
//		}

/*
answer is A and E
 */