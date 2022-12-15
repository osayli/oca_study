package Q201_to_Q223.Q215;


import java.security.PublicKey;

class LogFileException extends Exception{}
class AccessViolationException extends RuntimeException{}

public class App {
    public static void main(String[] args) throws LogFileException{
      App obj=new App();

      try{
          obj.open();
          obj.process();
          //insert code here
      }catch(Exception e){
          System.out.println("Completed.");
      }
    }
    public void process() throws LogFileException {
        System.out.println("Processed.");
        throw new LogFileException();
    }
    public void open(){
        System.out.println("Opened.");
        throw new AccessViolationException();
    }
}
/*
Which action fixes the compiler error?
A. At line 25, add throws AccessViolationException
B. At line 21, add throws LogFileException
C. At line 10, replace throws LogFileException with throws AccessViolationException
D. At line 16, insert throw new LogFileException ();

Answer: B
 */