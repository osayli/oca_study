package Q061_to_Q080.q076;

abstract class Planet{
    protected void revolve(){};//line 2
    abstract void rotate();   //line 4
}
class Earth extends Planet {
    public void revolve(){}; //line 8
    protected void rotate(){};//line 10
}
/*
Which two modifications enable the code to compile? or question might be three modifications
A. Make the method at line 8 protected.
B.	Make the method at line 8 public.
C.	Make the method at line 10 protected.
D.	Make the method at line 4 public.
E.	Make the method at line 2 public.
Answer: AC veya BC ikiside calisir
 */