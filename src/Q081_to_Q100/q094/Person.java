package Q081_to_Q100.q094;

public class Person {
    String name;
    int age;

    Person(String name){         //line n1
        setName(name);
    }
    public Person(String name,int age){
        //Person(name);           //line n2
        this(name);
        setAge(age);

    }
    //setter and getter methods go here


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String show(){
        return name+" "+age;
    }
}
