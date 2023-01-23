package RuntimeException;

import java.util.Scanner;

public class NumberException1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		try {
			age(a);
		} catch (NumberException ob) {
			System.out.println(ob);
		}
		System.out.println("Age Printed");
	}

	public static void age(int a) {
		// Scanner sc = new Scanner(System.in);

		if (a > 120) {
			throw new NumberException("Invalid Entry");
		} /*
			 * else { System.out.println("Enter your District name :"); String dist =
			 * sc.next(); }
			 */
	}

}
