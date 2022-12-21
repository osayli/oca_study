package Q041_to_Q060.q060;
interface Readable{
    public void readBook();
    public  void setBookMark();
}
abstract  class Book implements Readable{ //line n1
    public void readBook(){}
    //line n2
}


class EBook extends Book{//line n3
    public void readBook() {}
        //line n4
    public void setBookMark(){}
    }
/*
 * Which option enables the code to compile?
 *
A. Replace the code fragment at line n1 with:
	class Book implements Readable{

B. At line n2 insert:
	public abstract void setBookMark();

B. Replace the code fragment at line n3 with:
	abstract class EBook extends Book{

D. At line n4 insert:
	public void setBookMark(){}

*/

/*
Answer is D
 */