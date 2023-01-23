package arraylist;

import java.util.ArrayList;

public class Storage {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(new Student("Saroj", 301));
		a.add(new Student("Taukir", 201));
		a.add(new Student("Sourabh", 303));
		a.add(new Student("Babu"));
		System.out.println("Employee Details :");
		a.add(new Employee("Shruti", 301, 25000d));
		a.add(new Employee("Ramya", 101, 35000d));
		a.add(new Employee("Raghu", 301, 45000d));
		a.add(new Employee("Dashwanth", 2345));
		for (Object i : a) {
			System.out.println(i);
		}
	}
}