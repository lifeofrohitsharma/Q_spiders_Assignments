package string;

// WAJP TO INTANTIATE STRING CLASS BY USING NEW KEYWORD AND STORE SAME STRING LITERALS AND COMPARE USING == 
public class String2 {
	public static void main(String[] args) {
		String str1 = new String("Gadhi");
		String str2 = new String("Gadhi");
		if (str1 == str2) {
			System.out.println("Comparision result of instatiate String two classes" + str1 == str2);
		}
	}
}
