package Q021_to_Q040.q035;

public class Q035 {
    public static void main(String[] args) {
      String opt="true"; // boolean opt=true;
        switch (opt){
            case "true":
                System.out.print("True ");
            break;
            default:
                System.out.println("***");
        }
        System.out.println("Done");
    }
}
//Which modification enables the code fragment to print TrueDone?
//A.	Replace line 5 With String opt = "true";Replace line 7 with case "true":
//B.	Replace line 5 with boolean opt = l;Replace line 7 with case 1:
//C.	At line 9, remove the break statement.
//D.	Remove the default section.