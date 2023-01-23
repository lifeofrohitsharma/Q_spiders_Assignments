package Encapsulation;

public class StudentExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ab = new Student("Rohit",75,64,75);
		ab.setBmarks(85);
		System.out.println("Student name is :"+ab.sname);
		System.out.println("Marks in Physics  :"+ab.pmarks);
		System.out.println("Marks in Chemistry  :"+ab.cmarks);
		System.out.println("Marks in Biology  :"+ab.getBmarks());
		
	}

}
