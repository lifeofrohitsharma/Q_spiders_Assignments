package arraylist;

public class Employee {
	String name;
	int eid;
	double salary;

	public Employee(String name, int eid, double salary) {
		this.name = name;
		this.eid = eid;
		this.salary = salary;
	}

	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + " " + eid + " " + salary;
	}
}
