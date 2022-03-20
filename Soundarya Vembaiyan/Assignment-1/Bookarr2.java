//A-4: 	Array of 5-Books and Print the details of each Book.
package Student;
import java.util.*;

public class Bookarr2 {

	public static void main(String args[]) {
		int i,n;
		Scanner ob=new Scanner(System.in);
		Books b[]=new Books[3];
		
		System.out.println("BOOK DETAILS ");
		for(i=0;i<5;i++)
		{
			b[i]= new Books();
			b[i].printBook();
			
		}
		

	}
}
