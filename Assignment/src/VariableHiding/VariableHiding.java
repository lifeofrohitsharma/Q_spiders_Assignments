package VariableHiding;

public class VariableHiding {
	static int a = 10;
	int b = 20;
	String c = "Rohit";
	char d = 'R';
	double phno = 9322211113d;

	static void print()
	
	{
		int a = 18;
		int b = 20;
		String c = "Rohit";
		char d = 'R';
		double phno = 9322211113d;
		
		VariableHiding ob = new VariableHiding();
		System.out.println(ob.a + ob.b);
		System.out.println("Name is :" + ob.c);
		System.out.println("Initials is :" + ob.d);
		System.out.println("Phone no is :" + ob.phno);
		System.out.println(a);
		System.out.println(VariableHiding.a);
	}

	public static void main(String[] args) {
		print();

	}
}
