package array;

// WAJP TO CREATE INT ARRAY AND PRINT ASCII VALUE FOR EACH ELEMENT..
public class TC{
	public static void main(String[] args) {
		int tc[] = { 77, 50, 92, 95, 89};
		for (int i : tc) {
			System.out.print((char) i);
		}
	}
}
