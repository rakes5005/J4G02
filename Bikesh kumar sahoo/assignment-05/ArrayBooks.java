//assignment-4 q-1
package Collection;

import java.util.ArrayList;

import java.util.Iterator;


public class ArrayBooks {

	public static void main(String[] args) {
		
		ArrayList<String>Books = new ArrayList<>();
		// TODO Auto-generated method stub
		
		Books.add("java");
		Books.add("python");
		Books.add("javascript");
		Books.add("Mysql");
		
		
		Iterator<String> Iterate = Books.iterator();
		System.out.println("Books: ");
		
		while(Iterate.hasNext()) {
			System.out.println(Iterate.next());
			System.out.println("  ");
		}
		

	}

}
