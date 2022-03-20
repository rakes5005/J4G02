//A-3: 	Modify the Book with Parameterized Constructors.
package Student;

import java.util.*;

public class Bookpara {
	String bname;
	int bid;
	String bauthor;

	Bookpara() {
		Scanner ob = new Scanner(System.in);
		System.out.print("   BOOK Details    \n");
		System.out.println("Enter Book NAME: ");
		bname = ob.next();
		System.out.println("Enter Book ID: ");
		bid = ob.nextInt();
		System.out.println("Enter Book Author: ");
		bauthor = ob.next();
	}

	Bookpara(String name, int id, String author) {
		this.bname = name;
		this.bid = id;
		this.bauthor = author;
	}

	void printBook() {
		System.out.println( bname+" , "+ bid+ " , "+ bauthor);
	}

	public static void main(String args[]) {
		Bookpara ob1 = new Bookpara("VIBES",1001,"JAMES");
		ob1.printBook();
		Bookpara ob2 = new Bookpara("SUBCONSIOUS",1002,"ELDLY");
		ob2.printBook();
		Bookpara ob3 = new Bookpara("WIZARD",1003,"LIZZY");
		ob3.printBook();


	}
}