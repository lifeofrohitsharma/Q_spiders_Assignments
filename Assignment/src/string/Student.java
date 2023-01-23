package string;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student(101, "SHYAM");
		Student s2 = new Student(102, "RAM");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));// false
	}

	public String toString() {
		return name + " " + id;
	}

	public boolean equals(Object o) {
		Student ob = (Student) o;
		if (this.id == ob.id)
			return true;
		else
			return false;
	}

}
