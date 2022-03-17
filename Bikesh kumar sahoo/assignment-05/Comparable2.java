package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable2 {
	public static void main(String args[]) {
		ArrayList<Comparable1> cl = new ArrayList<Comparable1>();
		cl.add(new Comparable1(101, "Vijay", 23));
		cl.add(new Comparable1(106, "Ajay", 27));
		cl.add(new Comparable1(105, "Jai", 21));

		Collections.sort(cl);
		for (Comparable1 ct : cl) {
			System.out.println(ct.rollno + " " + ct.name + " " + ct.age);
		}
	}

}
