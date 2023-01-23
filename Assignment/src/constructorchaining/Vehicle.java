package constructorchaining;

public class Vehicle {
	String brand;
	String color;
	double price;
	Vehicle(String brand, String color, double price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	Vehicle(String brand, double price)
	{
		this.brand=brand;
		this.price=price;
	}
}
