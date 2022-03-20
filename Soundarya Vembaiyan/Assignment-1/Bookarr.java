package Student;
import java.util.*;

public class Bookarr {

	public static void main(String args[]) {
		int i,n;
		Scanner ob=new Scanner(System.in);
		n=ob.nextInt();
		Books b[]=new Books[3];
		System.out.println("Enter the no. of books: \n" +n);
		for(i=0;i<5;i++)
		{
			b[i]= new Books();
			b[i].printBook();
			
		}


	}
}
