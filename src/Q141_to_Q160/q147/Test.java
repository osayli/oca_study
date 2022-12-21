package Q141_to_Q160.q147;

public class Test {
    public static void main(String[] args) {
        //Employee e1=new Employee();
        Employee e2=new Employee("Jack",50);
        Employee e3=new Employee("Chloe",40,5000);

        //e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}

/*
Answer is: compilation fails in the Test class

After fix:
Jack:50:2000
Chloe:40:5000
 */