package new_version.Q181ToQ200.q184;

public class Rectangle {

    private double length;
    private double height;
    private double area;

    public void setLength(double length){
        this.length=length;
    }

    public void setHeight(double height){
        this.height=height;
    }
    public void setArea(){
        area=length*height;
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(10);
        rectangle.setHeight(20);
        rectangle.setArea();
        System.out.println(rectangle.area);


    }
}
/*
Which two changes would encapsulate this class and ensure that the area field
is always equal to length * height whenever the Rectangle class is used?
A. Call the setArea method at the end of the setHeight method.
B. Call the setArea method at the beginning of the setHeight method.
C. Call the setArea method at the end of the setLength method.
D. Call the setArea method at the beginning of the setLength method.
E. Change the setArea method to private.
F. Change the area field to public.
Answer: A and C also E is optional
 */