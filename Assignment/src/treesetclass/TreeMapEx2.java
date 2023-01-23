package treesetclass;

import java.util.TreeMap;

public class TreeMapEx2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> ob = new TreeMap<Integer, String>();
		ob.put(1, "Rohit");
		ob.put(2, "Saroj");
		ob.put(3, "Babu");
		System.out.println(ob.get(2));
		System.out.println(ob.values());
		System.out.println(ob.entrySet());
		// System.out.println(ob);
	}
}
