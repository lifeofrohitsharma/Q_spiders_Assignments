package Hierarchical$Inheritance;

class TrackerBoy extends Person{
	int empid;
	double salary;
	String floorIncharge;
	
	TrackerBoy(String name, int age, int empid, double salary, String floorIncharge)
	{
		this.name=name;
		this.age=age;
		this.empid=empid;
		this.salary=salary;
		this.floorIncharge=floorIncharge;
	}
	
	void displayTracker()
	{
		System.out.println("Tracker boy name is :"+name);
		System.out.println("Tracker boy age is :"+age);
		System.out.println("Tracker boy empid is :"+empid);
		System.out.println("Tracker boy Salary is :"+salary);
		System.out.println("Floorincharge of :"+floorIncharge);
	}
	
}
