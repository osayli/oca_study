package Q041_to_Q060.q044;

import java.util.Scanner;

public class Q044 {
    public static  void menu(){
        System.out.println("1. Left 2. Right 0. Stop");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int option;
        /* insert code here */
        do{
            menu();
            System.out.println("Please enter your choice");
            option=scanner.nextInt();//code that reads the option goes here
            /* code that print the option go here*/
            switch (option){
                case 1:
                    System.out.println("You chose Left");
                    break;
                case 2:
                    System.out.println("You chose Right");
                    break;
                default:
                    System.out.println("Please enter one of the valid options");
            }
        }while (option!=0);

        System.out.println("You stopped, bye");
    }
}
//and the requirements of the application:
// 	It must display the menu.
// 	It must print the option selected.
// 	It must continue its execution till it reads ‘0’.
//Which code fragment can be used to meet the requirements?

/*
A. for (option = 0; option !0; option = // code that reads the option goes here){
	//code that print the option goes here
	}

B. while (option !=o){
	menu();
	option = //  code that reads the option goes here
	//code that print the option goes here
	 }

C. do {
	menu();
	option = //  code that reads the option goes here
	//code that print the option goes here
	 }while (option != 0);

D. while (option != 0);{
	menu();
	option = //  code that reads the option goes here
	//code that print the option goes here
	 }

*/

/*
Answer is : C
 */