package twodimensionalarray;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int a[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements inside array :");
		for (int i = 0; i < a.length; i++) // outer for loop
		{
			for (int j = 0; j < a[i].length; j++) // inner for loop
			{
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Printing array to output window :");
		for (int i = 0; i < a.length; i++)

			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		sc.close();
	}
}
