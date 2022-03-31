package Collection;
import java.util.HashMap;

import java.util.Map;


public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer, String> map = new HashMap<>();
		
		map.put(1, "bikesh");
		map.put(2, "bharat");
		map.put(3, "arjun");
		map.put(4, "bheem");
		map.put(5, "nakul");
		map.put(6, "sahdev");
		map.put(7, "judhisthira");
		map.put(8, "karna");
		map.put(9, "abhimanyu");
		map.put(10, "satyaki");
		map.put(11, "bheesma");
		map.put(12, "dronacharya");
		
		
		System.out.println("Itereating hashmap:");
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		
		
		

	}

}
