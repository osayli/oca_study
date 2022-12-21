package Q041_to_Q060.q042;

public class Q042 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("B");
		sb.append("C");

		System.out.println("before delete: " + sb);
		//sb.deleteAll();//there is no deleteAll() method in StringBuilder class
		//sb.delete(0,sb.size()); //there is no size() method in StringBuilder class
		sb.delete(0, sb.length());
		//sb.removeAll();//there is no removeAll() method in StringBuilder class
		
		System.out.println("after delete: " + sb);

	}
}
/*
42. Which statement will empty the contents of a StringBuilder variable named sb?
A. sb. deleteAll ();
B. sb. delete (0, sb. size () );
C. sb. delete (0, sb. length () );
D. sb. removeAll ();
 */