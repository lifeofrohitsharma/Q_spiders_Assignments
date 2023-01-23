package collectionsFrameworks;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Object> ob= new ArrayList<Object>();
		ob.add(100);
		ob.add("BTM");
		ob.add('A');
		ob.add(true);
		ob.add(76.72f);
		for (Object i : ob) {
			System.out.println(i);
		}

	}
}
