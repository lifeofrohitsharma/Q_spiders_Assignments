package array;

// WAJP TO CREATE AN ARRAY AND FIND THE SUM OF ELEMENTS IN THE ARRAY.
public class SumArray {
	public static void main(String[] args) {
		int no[] = new int[5];
		no[0] = 20;
		no[1] = 8;
		no[2] = 23;
		no[3] = 50;
		no[4] = 6;
		int sum = 0;
		for (int i = 0; i < no.length; i++)
			sum = sum + no[i];
		{
			System.out.println("Sum of integer is :" + sum);
		}
	}
}
