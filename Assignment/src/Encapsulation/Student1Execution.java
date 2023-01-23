package Encapsulation;

public class Student1Execution {

	public static void main(String[] args) {
		Student1 ab =new Student1("Rohit",29,7334);
		System.out.println("Name of the Student is: "+ab.sname);
		System.out.println("Roll No of the Student is: "+ab.rno);
		System.out.println("Student ID  is: "+ab.getSid());
		ab.setSid(8554);
		System.out.println("Updated Student ID  is: "+ab.getSid());
		


	}
}
