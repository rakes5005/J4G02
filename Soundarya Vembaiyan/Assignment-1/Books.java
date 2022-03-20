//A-2: 	Create a Book class with Parameters.
package Student;

import java.util.*;
import java.io.*;

class Books {
	String bname;
	int bid;
	String bauthor;

	Books() {
		Scanner ob = new Scanner(System.in);
		System.out.print(" BOOK Details: \n");
		System.out.println("Enter Book NAME: ");
		bname = ob.next();
		System.out.println("Enter Book ID: ");
		bid = ob.nextInt();
		System.out.println("Enter Book Author: ");
		bauthor = ob.next();
	}

	void printBook() {
		System.out.println("BOOK NAME:  " + bname);
		System.out.println("BOOK ID:  " + bid);
		System.out.println("BOOK AUTHOR:  " + bauthor);
	}

	public static void main(String args[]) {
		Books ob1 = new Books();
		ob1.printBook();

	}
}