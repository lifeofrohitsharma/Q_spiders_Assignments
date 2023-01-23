package map;

import java.util.HashMap;

public class MapEx1 {
	public static void main(String[] args) {
		HashMap<String, Object> ob = new HashMap<String, Object>();
		ob.put("Name", "Babu");
		ob.put("Age", 27);
		ob.put("Place", "Bhagalpur");
		ob.put("Qualification", "Third pass");
		ob.put("Phone No", 98999887766l);

		System.out.println(ob.values());
		System.out.println(ob.entrySet());
		System.out.println(ob.keySet());
	}
}
