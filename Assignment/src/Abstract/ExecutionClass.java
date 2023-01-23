package Abstract;

import java.util.Scanner;

public class ExecutionClass {
	public static void main(String[] args) {
		System.out.println("For Coffe 1 and Tea 2 :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1: {
			TeaVending b = new TeaVending();
			b.addIngredients();
			b.printProduct();
			
		}
			break;
		case 2: {
			CoffeVending d = new CoffeVending();
			d.printProduct();
			d.addIngredients();
		}
			break;
		default: {
			System.out.println("Invalid Choice");
		}
			sc.close();
		}
	}
}
