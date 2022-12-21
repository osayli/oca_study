package Q041_to_Q060.q057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

    public static void checkAge(List<Person> list, Predicate<Person> predicate){
        for(Person p:list){
            if(predicate.test(p)){
                System.out.println(p.name+ "");
            }
        }
    }

    public static void main(String[] args) {
        List<Person> iList= Arrays.asList(new Person("Hank",45),
                                         new Person("Charlie",40),
                                         new Person("Smith",38)  );
        //line n1
        //checkAge(iList,()->p.getAge()>40);
        //checkAge(iList,Person p->p.getAge()>40);
        checkAge(iList,p->p.getAge()>40);
        //checkAge(iList,(Person p)->{p.getAge()>40;});

        /*
        buda oluyor
        //checkAge(iList,(Person p)->p.getAge()>40);
         */
    }
}
// Which code fragment, when inserted at line n1, enables the code to print Hank?
//A checkAge(iList,()->p.getAge()>40);
//B checkAge(iList,Person p->p.getAge()>40);
//C checkAge(iList,p->p.getAge()>40);
//D checkAge(iList,(Person p)->{p.getAge()>40;});

//Answer is C
 /*
        buda oluyor
        //checkAge(iList,(Person p)->p.getAge()>40);
         */