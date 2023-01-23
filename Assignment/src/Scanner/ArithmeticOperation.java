package Scanner;

// *********************************************Calculator*********************************************
import java.util.Scanner;

public class ArithmeticOperation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hi user Let's perform some Arithematic operation\n");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(" Enter the First Value");
			double a = sc.nextDouble();
			System.out.println(" Enter the Second Value");
			double b = sc.nextDouble();
			System.out.println("Choose any Arithematic Operation");
			System.out.println(
					"-->For Addition Press :1\n-->For Subtraction presss 2:\n-->For Multiplication press 3:\n-->For Division press 4:\n");
			int operation = sc.nextInt();
			switch (operation) {
			case 1:
				System.out.println("Addition of two numbers");
				double c = 0;
				c = a + b;
				System.out.println("Addition of two numbers is:" + c + "\n");
				break;
			case 2:
				System.out.println("Subtraction of two numbers");
				double d = 0;
				d = a - b;
				System.out.println("Subtraction of two numbers is:" + d + "\n");
				break;
			case 3:
				System.out.println("Multiplication of two numbers");
				double e = 0;
				e = a * b;
				System.out.println("Multiplication of two numbers is:" + e + "\n");
				break;
			case 4:
				System.out.println("Division of two numbers");
				double f = 0;
				f = a % b;
				System.out.println("Division of two numbers is:" + f + "\n");
				break;
			}
		} while (true);

	}

}
