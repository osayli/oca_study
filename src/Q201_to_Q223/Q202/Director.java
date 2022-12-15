package Q201_to_Q223.Q202;

public class Director extends Manager{
    public int stockOptions;

    public static void main(String[] args) {
        Employee employee=new Employee();
        Employee manager=new Manager();
        Employee director=new Director();
        //line n1
        //director.stockOptions=1_000;
        employee.salary=50_000;
        //manager.budget=1_000_000;
        //manager.stockOptions=500;
        //employee.budget=200_000;
        director.salary=80_000;

    }
}
/*
Which two options compile when placed at line n1 of the main method?(Choose two)
A)director.stockOptions=1_000;
B)employee.salary=50_000;
C)manager.budget=1_000_000;
D)manager.stockOptions=500;
E)employee.budget=200_000;
F)director.salary=80_000;


Answer is B and F
 */