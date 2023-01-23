package listIterator;

import java.util.ArrayList;

// for list interface, by using ArrayList class
public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Object> ob = new ArrayList<Object>();
		ob.add("Java");
		ob.add("SQL");
		ob.add(100);
		ob.add(12.2f);
		ob.add("A");
		ob.add(true);
		System.out.println("printing directly");
		System.out.println(ob);// printing directly
		System.out.println("Printing using for each loop :");
		for (Object i : ob) {
			System.out.println(i);
		}
		// for each loop ends
		for (int i = 1; i < ob.size(); i++) {
			System.out.println(ob.get(i));// fetching the data from the index directly
		} // for each loop ends
	}
}
