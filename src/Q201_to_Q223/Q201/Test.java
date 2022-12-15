package Q201_to_Q223.Q201;

public class Test {
    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[1]=new Student("Richard");
        students[2]=new Student("Donald");

       /* if the question was like that, there would not be an error.

       for (Student s:students){
            System.out.println(""+s);
        }
*/
        for (Student s:students){
            System.out.println(""+s.name);
        }
    }
}

/*
What is the result?
A) nullRichardDonald
B)RichardDonald
C)Compilation fails
D)An ArrayIndexOutOfBoundsException is thrown at runtime
E)A NullPointerException is thrown at runtime

Answer is E
 */