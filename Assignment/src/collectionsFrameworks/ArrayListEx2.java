package collectionsFrameworks;

// WAJP TO CREATE AN ARRAY LIST FOR DIFFERENT OBJECT AND ACCESSING THE LIST WITH THE HELP OF ADDALL METHOD.
import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList<Object> ob = new ArrayList<Object>();
		ArrayList<Object> ob2 = new ArrayList<Object>();

		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(76.72f);
		/*
		 * for (Object i : ob2) { System.out.println(i); }
		 */
		ob2.add(7666);
		ob2.addAll(ob);
		System.out.println(ob2);

	}
}
