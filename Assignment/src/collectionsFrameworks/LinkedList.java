package collectionsFrameworks;

import java.util.ArrayList;
import java.util.ListIterator;

public class LinkedList {
	public static void main(String[] args) {
		ArrayList<Object> ob = new ArrayList<Object>();
		ob.add(100);
		ob.add(80);
		ob.add(60);
		ob.add("BTM");
		ob.add("Q Spiders");

		ListIterator<Object> i = ob.listIterator();
		while (i.hasNext()) {
			Object a = i.next();
			if (a.equals(78)) {
				i.remove();
			}
		}
		System.out.println("After removing 78 from list");
		for (Object k : ob) {
			System.out.println(k);
		}

	}
}
