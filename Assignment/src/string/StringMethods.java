package string;

public class StringMethods {

	public static void main(String[] args) {
		String str = new String("karnataka");
		String s = "Karnataka";
		System.out.println("Comparing two String by ignoring lowerCase and upperCase :" + s.equalsIgnoreCase(str));
		System.out.println("Comparing two Strings :" + str.equals(s));
		System.out.println("value of char at Index of 2 is : " + str.charAt(5));
		System.out.println("Substring of String :" + str.substring(2));
		System.out.println("Length of String : " + str.length());
		System.out.println("Last Index value of char at index 4 is : " + str.lastIndexOf('k'));
		System.out.println("Index value of char at index 4 is : " + str.indexOf('a'));
		System.out.println("Sub String between the indexes 2 and 7 is :" + str.substring(2, 7));
		System.out.println("String in Upper Case is " + str.toUpperCase());
		System.out.println("String in lower Case is " + str.toLowerCase());
		System.out.println();

	}

}
