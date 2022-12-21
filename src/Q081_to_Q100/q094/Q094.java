package Q081_to_Q100.q094;

public class Q094 {
    public static void main(String[] args) {
        Person p1=new Person("Jesse");
        Person p2=new Person("Walter",52);
        System.out.println(p1.show());
        System.out.println(p2.show());
    }
}

/*
 * What is the result?
A. Compilation fails at both line n1 and line n2.
B. Compilation fails only at line n2.
C. Compilation fails only at line n1.
D. Jesse 25Walter 52
 */

// Answer B => compilation fails at line n2
/*
Error on console:
java: cannot find symbol
  symbol:   method Person(java.lang.String)
  location: class new_version.Q81ToQ100.q094.Person
 */


/*
After fix, answer is:
Jesse 0
Walter 52
 */