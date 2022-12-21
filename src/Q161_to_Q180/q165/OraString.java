package Q161_to_Q180.q165;

public class OraString {
    String s;
    public boolean equals(OraString str){
        return this.s.equalsIgnoreCase(str.toString());
    }
    OraString(String s){
        this.s=s;
    }
}
