package listIterator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx1 {
	public static void main(String[] args) {
		LinkedList<Integer> ob = new LinkedList<Integer>();
		ob.add(10);
		ob.add(50);
		ob.add(60);
		ob.add(20);
		ob.add(80);
		System.out.println("Printing Elements in Forward Direction" + "\n");
		ListIterator<Integer> obj = ob.listIterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		ob.set(2, 40); // we can set the elements at particular index before accessing in reverse order
		System.out.println("\n" + "Printing Backward :" + "\n");
		while (obj.hasPrevious()) {
			System.out.println(obj.previous());
		}
		Collections.sort(ob);
		System.out.println("Sorting elements in Accending Order:" + ob + "\n");
		Collections.reverse(ob);
		System.out.println("Sorting elements in Deccending Order:" + ob + "\n");

		LinkedList<Object> ob1 = new LinkedList<Object>();
		ob1.add("Ratnesh");
		ob1.add("is");
		ob1.add("a");
		ob1.add("Good");
		ob1.add("Boy");
		ob1.add(100);
		ob1.add(50);
		ob1.add(25);
		ob1.add(12.5f);
		ListIterator<Object> obj2 = ob1.listIterator();
		System.out.println("For <objects> :");
		System.out.println("Forward Direction :" + "\n");
		while (obj2.hasNext()) {
			System.out.println(obj2.next());
		}
		System.out.println("\n" + "Backward Direction :" + "\n");

		while (obj2.hasPrevious()) {
			System.out.println(obj2.previous());
		}

	}
}
