package polymorphism;

public class MethodOverloex {
	public static void main(String[] args) {
		 add(25,56,25);
		 sub(65,34);
	}
	static void add(int a, int b , int c)
	{
		System.out.println("addition of three numbers are :"+(a+b+c));
	}
	static void sub(int a, int b)
	{
		System.out.println("Subtraction is :"+(a-b));
	}
}
