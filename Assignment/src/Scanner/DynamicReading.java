package Scanner;
//WAJP TO TAKE INPUT FROM USER AND GIVE SUM OF THOSE NO IN RESULTANT TABLE.//
import java.util.Scanner;
public class DynamicReading {

	public static void main(String[] args) {
		
		System.out.println("Hello User");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the First value");
		double a =sc.nextDouble();
		System.out.println("Enter the Second value");
		double b =sc.nextDouble();
		System.out.println("Sum of two No is: "+(a+b));
		sc.close();


		
		

	}

}
