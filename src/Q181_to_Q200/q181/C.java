//import java.io.IOException; if import is before package it does not work.
package new_version.Q181ToQ200.q181;

import java.io.IOException;

public class C {
    public static void main(String[] args) throws IOException {

    }
}
    /*
    Which statement is true?
A. Only the A.Java file compiles successfully.
B. Only the B.java file compiles successfully.
C. Only the C.java file compiles successfully.
D. The A.Java and B.java files compile successfully.
E. The B.java and C.java files compile successfully.
F. The A.Java and C.java files compile successfully.

Answer: F
if  import is before package in class C than answer is:A
     */

/*
Explanation:
1-No, you can not. Variables inside method are considered
 local and can't have modifiers. You can have private
  fields in a class, but this is different.
2-Access modifiers are used to determine the scope of some
 members (attributes, constructors, methods) of the class.
 The scope of a method variable is only that method,
 so you do not need to specify the scope explicitly.

3-A variable declared directly within a method is a
local variable. A local variable cannot be declared
 as private. In fact, the only modifier that you can
  use on a local variable declaration is final.
4-
}
 */
