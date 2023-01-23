package exceptionHandling;

//import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		String s = "java";
		char c = 'a'; // 4, index 0 to 3

		try {
			c = s.charAt(4);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println(s.toUpperCase());
		System.out.println("Languages");
	}
}
