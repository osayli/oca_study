package Q061_to_Q080.q062;

interface Downloadable{
    public void download();
}
interface Readable extends Downloadable{ //line n1
    public void readBook();
}
abstract class Book implements Readable{ //line n2
    public void readBook(){
        System.out.println("Read Book");
    }
}
 class EBook extends Book{  //line 3
     public void readBook(){
         System.out.println("Read E-Book");
     }
     public void download(){
     }

     public static void main(String[] args) {
         Book book1=new EBook();
         book1.readBook();
     }
}
/*


What is result?
A.Compilation fails at linen2.
B.ReadBook
C.ReadE-Book
D.Compilation fails at line n1
E.Compilation fails at line n3
*/
//answer E

//we need to add abstract method in non-abstract class
// public void download(){}
//
//