package Q001_to_Q020.q004;

public class Q004 {
    public static void main(String[] args) {
        int[] stack={10,20,30};
        int size=3;int idx=0;
        /* line n1   */
        do{
            idx++;
        } while (idx<size-1);
        System.out.println("The Top element: "+stack[idx]);
    }
}
/*
Which code fragment, inserted at line n1, prints The Top element: 30?
 * A. 		do {							// Loop steps:
			idx++;						// 1: idx = 0,
		}while(idx >= size);	// 1: idx =1,  (1>=3) is false loop ends		 --> The top element: 20

	B. 									// Loop steps:
			while(idx < size){	// 1: idx = 0,   2: idx =1 ,	3: idx =2. 4: idx = 3     (3<3) is false loop ends
			idx++;						// 1: idx =1,  	2: idx =2, 	3: idx =3, 		--> ArrayIndexOutOfBoundsException
		}

	C. 	do {							// Loop steps:
			idx++;						// 1: idx = 0,   2: idx =1 ,
		}while(idx < size-1);	// 1: idx =1,  	2: idx =2, (2<2) is false loop ends	--> The top element: 30

	D. 	do {							// Loop steps:
			idx++;						// 1: idx = 0,   2: idx =1 ,	3: idx = 2		4: idx =3
		}while(idx <= size);	// 1: idx =1,  	2: idx =2, 	3: idx =3  	4: idx = 4 (4<=3) is false loop ends
																													--> ArrayIndexOutOfBoundsException

	E. 												// Loop steps:
			while(idx <= size -1){		// 1: idx = 0,   2: idx =1 ,	3: idx = 2		4: idx =3  (3<=2) is false loop ends
			idx++;								// 1: idx =1,  	2: idx =2, 	3: idx =3  	 --> ArrayIndexOutOfBoundsException
 */

