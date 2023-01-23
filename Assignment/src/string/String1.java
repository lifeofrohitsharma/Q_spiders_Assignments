package string;

// WAJP TO STORE TWO SAME STRING LITERALS AND COMPARE BY USING == OPERATOR.
public class String1 {
	public static void main(String[] args) {
		System.out.println("Here two String Str1 and str2");
		String str1 = "java";
		String str2 = "java";
		if (str1 == str2) {
			System.out.println("Comparision of str1 and str2 is :" + str1 == str2);
		}
	}
}
