package Collection;
import java.util.HashSet;

public class BookObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hset = new HashSet<String>();
		hset.add("Ramayana");
		hset.add("Mohabharat");
		hset.add("BishnuPuran");
		hset.add("Garudapurana");
		hset.add(null);
		
		System.out.println(hset);

	}


}
