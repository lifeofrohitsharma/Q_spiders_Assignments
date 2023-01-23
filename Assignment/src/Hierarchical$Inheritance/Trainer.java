package Hierarchical$Inheritance;

class Trainer extends Person {
	int tid;
	String designation;
	double salary;
	
	Trainer(String name, int age, int tid, String designation, double salary)
	{
	this.name=name;
	this.age=age;
	this.tid=tid;
	this.designation=designation;
	this.salary=salary;
	}
	void displayTrainer()
	{
		System.out.println("Trainer name is :"+name);
		System.out.println("Trainer age is :"+age);
		System.out.println("Trainer id is :"+tid);
		System.out.println("Trainer Designation is :"+designation);
		System.out.println("Trainer Salary is :"+salary);

}
}
