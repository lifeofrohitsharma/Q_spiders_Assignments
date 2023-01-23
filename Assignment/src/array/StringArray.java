package array;

//WAJP TO CREATE A STRING ARRAY AND PRINT ELEMENTS USING FOR EACH LOOP SIZE SHOULD BE INITIALIZED AS 10. 
//import java.util.Scanner;

public class StringArray {
	public static void main(String[] args) {
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the value if i");
		// String i=sc.next();
		String str[] = new String[10];
		str[0] = "Maths 1";
		str[1] = "Maths 2";
		str[2] = "Physics";
		str[3] = "Chemistry";
		str[4] = "Biology";
		str[5] = "English";
		str[6] = "Hindi";
		str[7] = "Physical Edu.";
		str[8] = "IP";
		str[9] = "Music";
		for (String i : str) {
			System.out.println(i);
		}
	}
}
