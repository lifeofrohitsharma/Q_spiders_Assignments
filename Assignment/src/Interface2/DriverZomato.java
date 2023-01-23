package Interface2;

public class DriverZomato {
	public static void main(String[] args) {
		Zomato z = new Zomato("Rahul", 9543218632l, 12345678912l, 8899, 2500d);
		z.view();
		z.payment();
		GoogleMap.locationAccess(); // Calling Static Method using Class_Name.Method_Name
	}
}
