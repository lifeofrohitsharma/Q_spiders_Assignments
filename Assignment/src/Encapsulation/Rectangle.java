package Encapsulation;

/*Create a class 'Rectangle' and declare the variable length
and breadth as private. One Constructor will be used for
initializing the value of variables.
Step 1: Declare instance variables as private in the class. 
Step 2: Declare a constructor rectangle and define parameters
of the constructor.
Step 3: Create a getter method for each private variable.
Step 4: Create a setter method for each private variable 
and define parameters.
Step 5: Create an object of class Rectangle and assign 
values of the parameter used in the constructor.
Step 6: Call getter method to read value of variable 
because we cannot read the value directly due to privacy.
Step 7: Calculate area of the rectangle and print it on 
the console. 
Step 8: Let's update the new value of the variable using
the setter method.
Step 9: Call getter method to read the updated value.*/

	class Rectangle {
	int length;
	private int breadth;
	
	Rectangle(int length, int breadth) 
	{
		this.length = length;
		this.breadth = breadth;
	}
		public void setBreadth(int breadth) 
		{
			this.breadth=breadth;
		}
		public int getBreadth()
		{
			return breadth;
		}
	}
	
	
	
	

