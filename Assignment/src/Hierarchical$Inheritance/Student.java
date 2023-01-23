package Hierarchical$Inheritance;

class Student extends Person{
	int sid;
	String stream;
	
	Student(String name, int age, int sid, String stream)
	{
		this.name=name;
		this.age=age;
		this.sid=sid;
		this.stream=stream;	
	}
	
	void displayStudent()
	{
		System.out.println("Student name is :"+name);
		System.out.println("Student age is :"+age);
		System.out.println("Student id is :"+sid);
		System.out.println("Student Stream is :"+stream);
	
	}
}
