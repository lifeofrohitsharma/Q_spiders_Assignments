package polymorphismvariablehiding;

import java.io.PrintStream;

public class B extends A{
	float a=85.2f;
	void print() {
		System.out.println(a);//85.2
		System.out.println(super.a);//12
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.print();
		System.out.println(obj.a);
	}
}
