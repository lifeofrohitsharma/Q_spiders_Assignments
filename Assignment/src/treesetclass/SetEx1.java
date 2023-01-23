package treesetclass;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<Integer> ob = new HashSet<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(40);
		ob.add(null); // adding null values are allowed
		ob.add(10); // added duplicate value in HashSet which is not possible
		System.out.println("Printing Elements of HashSet using for loop " + "\n");
		for (Integer i : ob) {
			System.out.println(i);
		}
		System.out.println("\n" + "Printing Elements of HashSet using ITERATOR while loop " + "\n");

		Iterator<Integer> obj = ob.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
	}
}
