package Q121_to_Q140.q127;

public class Q127 {
    public static void main(String[] args) {
        /*
		 * 	The following grid shows the state of a 2D array:

		|--O--|--O--|-----|
		|-----|--X--|--O--|
		|--X--|-----|--X--|

		The grid is created with the following code:
		 */
        char[][] grid=new char[3][3];
        grid[1][1]='X';
        grid[0][0]='O';
        grid[2][0]='X';
        grid[0][1]='O';
        grid[2][2]='X';
        grid[1][2]='O';
        //line n1
        grid[2][1]='X';
    }
}
/*
	Which line of code, when inserted in place of //line n1, adds an X into the grid so that the grid contains three
	consecutive X’s?

A. grid[2][1] = ‘X’;
B. grid[3][2] = ‘X’;
C. grid[3][1] = ‘X’;
D. grid[2][3] = ‘X’;

	Answer: A

	Soruda 3 tane X'i yan yana yazdirmak istiyor.
	 Yani 3. siradaki yere 1 X daha ekleyecegiz.
 */

