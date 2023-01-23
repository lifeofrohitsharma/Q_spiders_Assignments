package hashSet;

import java.util.*;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>(); // Output will come in random order because of using HashSet
		h.add("SQL");
		h.add("BTM");
		h.add("Manual");
		h.add("java");
		h.add("SQL");
		h.add("BTM");
		h.add("Manual");
		for (String s : h) {
			System.out.println(s);
		}

	}
}
