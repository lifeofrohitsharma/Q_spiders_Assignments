package exceptionHandling;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter Second number :");
		int b = sc.nextInt();
		System.out.println("Division");
		try {
			System.out.println(a / b);
		} catch (ArithmeticException ob) {
			System.out.println("Handled");
		}
		System.out.println("Okay");
		// System.out.println("Exception is there :");

	}
}
