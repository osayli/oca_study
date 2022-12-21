package new_version.Q181ToQ200.q181;

public class B {
    private int doStuff(){
        /*public int x=100;
        protected int x=100;
        default int x=100;
        private int x=100;*/
        int x=100;
        return  x++;
    }
}
/*
No, you can not. Variables inside method are considered local and can't have modifiers. You can have private fields in a class, but this is different:

public class Test {
    public String getUserName(){

        user="David";
        return user;

    }
    private String user;
}
 */