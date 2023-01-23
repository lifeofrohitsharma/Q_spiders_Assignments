package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortMethod {
	public static void main(String[] args) {
		ArrayList<Integer> ob = new ArrayList<Integer>();
		ob.add(10);
		ob.add(60);
		ob.add(100);
		ob.add(50);
		ob.add(90);
		ob.add(20);
		//Collections.sort(ob); // for fetching the elements in the increasing Order
		Collections.reverse(ob); // for fetching the elements in the Decreasing Order
		for (Object i : ob) {
			System.out.println(i);
		}
	}
}
