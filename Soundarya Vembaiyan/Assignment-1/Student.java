//A-1: 	Print NAME and CALL the Function from Main method
package Student;

import java.io.*;
import java.util.*;

public class Student {
	String name;
	int id;

	Student() {
		Scanner ob = new Scanner(System.in);
		System.out.print(" STUDENT Details \n");
		System.out.print("Enter name: \n");
		name = ob.next();
		System.out.print("Enter id: ");
		id = ob.nextInt();
	}

	void disp() {

		System.out.println("Enter your Name=" + name);
		System.out.println("Enter your Id=" + id);
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.disp();

	}

}
