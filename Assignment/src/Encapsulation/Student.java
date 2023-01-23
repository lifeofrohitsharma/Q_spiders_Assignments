package Encapsulation;

/* Create a class Student and declare variables 
stdName, phyMarks, cheMarks and bioMarks as private.
Step 1: Declare variables private in the class.
Step 2: Apply public getter method for each 
private variable in the class.
Step 3: Apply public Non-static method to print values 
of the variables and calculate percentage and print.
Step 4: Create the object of class Student by using a 
new keyword. Step 5: Call setter method and set the
value of variables
Step 6: Call Non-static method to read and print the 
value of variables and percentage on console.*/
//------------>

class Student 
		{
	String sname;
	int pmarks;
	int cmarks;
	
	public Student(String sname, int pmarks, int cmarks, int bmarks) {
		this.sname = sname;
		this.pmarks = pmarks;
		this.cmarks = cmarks;
		this.bmarks = bmarks;
	}
	private int bmarks;
	public int getBmarks() {
		return bmarks;
	}
	public void setBmarks(int bmarks) {
		this.bmarks = bmarks;
	}
	
	
}
