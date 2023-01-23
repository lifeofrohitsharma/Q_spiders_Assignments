package listIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorList {
	public static void main(String[] args) {
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(50);
		Iterator<Integer> i = x.iterator();
		while (i.hasNext()) {
		Integer j=i.next();
		if(j==30) {
			i.remove();
		}
		System.out.println(j);	
		}
	}
}
