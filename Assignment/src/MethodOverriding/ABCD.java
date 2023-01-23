package MethodOverriding;

public class ABCD extends ABC{
	void example()
	{
		System.out.println("B class Method");
		System.out.println("Child class is B");
	}
	void own()
	{
		System.out.println("Child class Method");
		System.out.println("Hello from own Method");
	}
	public static void main(String[] args) {
		B ob=new B();
		ob.example();//child class method will execute...
		A a =new B();// Upcasting statement...
		a.example();
		a.own();//it will produce CTE own is not in 
	}
}
