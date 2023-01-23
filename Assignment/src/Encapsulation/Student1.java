package Encapsulation;
/*Create a class Student and declare variables 
stdName, stdRollNo, and student lD as private.
Step 1: Declare variables private in the class.
Step 2: Apply public getter method for each private variable
in the class 
Step 3: Apply a public setter method for each private 
variable in the class.
Step 4: Create the object of class Student by using a 
new keyword.
Step 5: Call setter method and set the value of variables.
Step 6: Call getter method to read the value of variables
and print it on console.*/

public class Student1 {
	String sname;
	int rno;
	private int sid;
	
	public Student1(String sname, int rno, int sid) {
		this.sname = sname;
		this.rno = rno;
		this.sid = sid;
	}
		public void setSid(int sid)
		{
			this.sid=sid;
		}
		public int getSid()
		{
			return sid;
		}	
}
