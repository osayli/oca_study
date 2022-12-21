package Q121_to_Q140.q135;

import java.util.Arrays;

public class Q135_v2 {
    public static void main(String[] args) {
        Planet_v2[] planets={
                new Planet_v2("Mercury",0),
                new Planet_v2("Venus",0),
                new Planet_v2("Earth",1),
                new Planet_v2("Mars",2)
        };
        System.out.println(Arrays.toString(planets));
        System.out.println(planets[2].name);
        System.out.println(planets[2].moons);
    }
}
/*
Answer is:
[Planet_v2{name='Mercury', moons=0}, Planet_v2{name='Venus', moons=0}, Planet_v2{name='Earth', moons=1}, Planet_v2{name='Mars', moons=2}]
Earth
1
 */