package Hierarchical$Inheritance;

	class DriverHierarchical {
public static void main(String[] args) {
	Student ab = new Student("Rohit",24,7334,"Mechanical");
	System.out.println("Details of the Student");
	ab.displayStudent();
	Trainer bc = new Trainer("Shruti", 24, 1225, "Java Trainer", 75000d);
	System.out.println("Details of the Trainer");
	bc.displayTrainer();
	TrackerBoy tb = new TrackerBoy("Rahul", 29, 1334, 25000d, "New Building");
	System.out.println("Details of the Tracker Boy");
	tb.displayTracker();
}
}
