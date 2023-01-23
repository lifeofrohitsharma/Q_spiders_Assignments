package string;

// WAJP TO DEFINE A "toStrinng Method" IN JAVA..
public class Employee {
	int empid;
	String name;

	Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "MUKESH");
		Employee e2 = new Employee(201, "AJAY");
		System.out.println(e1);
		System.out.println(e2);
	}

	public String toString() {
		return name + " " + empid;

	}
}
