package Q121_to_Q140.q135;

public class Planet_v2 {
    public String name;
    public int moons;

    public Planet_v2(String name,int moons){
        this.name=name;
        this.moons=moons;

    }

    @Override
    public String toString() {
        return "Planet_v2{" +
                "name='" + name + '\'' +
                ", moons=" + moons +
                '}';
    }
}
