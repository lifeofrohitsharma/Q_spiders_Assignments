package array;

//WAJP TP CREATE AN ARRAY TO PRINT NO IN REVERSE ORDER.
public class PrintNo {
	public static void main(String[] args) {
		int no[] = new int[5];
		no[0] = 20;
		no[1] = 8;
		no[2] = 23;
		no[3] = 50;
		no[4] = 6;
		for (int i = no.length - 1; i >= 0; i--) {
			System.out.println(no[i]);
		}
	}
}
