package arraylist;

public class Student {
	String name;
	int sid;

	public Student(String name, int sid) {
		this.name = name;
		this.sid = sid;
	}

	public Student(String name) {
		this.name = name;
	}

	public String toString() {
		return name + " " + sid;
	}
}
