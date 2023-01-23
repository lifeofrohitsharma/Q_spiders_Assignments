package listInterface;

import java.util.ArrayList;

public class ListInterface {
	public static void main(String[] args) {
		ArrayList<Object> x = new ArrayList<Object>();
		x.add("Rohit");
		x.add("Sharma");
		x.add("B-Tech");
		x.add("Mechanical");
		x.add(24);
		x.add("Delhi");
		x.add(4, "2019 Passout");
		System.out.println("Age is Present in the collection or not :" + x.contains(24));
		// x.remove(4);
		// x.addAll(x);
		System.out.println("Index value of Rohit :" + x.indexOf("Rohit"));

		System.out.println("Printing Elements :");
		for (Object i : x) {
			System.out.print(i + " ");
		}

	}
}
