package Q181_to_Q200.q195;

public class Q195 {
    public static void main(String[] args) {
        String shirts[][]=new String[2][2];
        shirts[0][0]="red";
        shirts[0][1]="blue";
        shirts[1][0]="small";
        shirts[1][1]="medium";

        for(String[] c: shirts){
           for(String s:c){
               System.out.print(s+":");
           }
        }
    }
}
/*
Which code fragment prints red: blue: small: medium?
C)   for(String[] c: shirts){
           for(String s:c){
               System.out.print(s+":");
           }
        }

 */