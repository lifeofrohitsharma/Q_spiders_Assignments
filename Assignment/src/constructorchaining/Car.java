package constructorchaining;

public class Car extends Vehicle {
	String model;
	Car(String brand, String color, double price, String model)
	{
		super(brand, color, price);
		this.model=model;
	}
	Car(String brand, String model, double price)
	{
		this(brand, null,price,null);
	}
	Car(String brand)
	{
		this(brand,null,0.0d );
	}
	void display()
	{
		System.out.println("Brand is :"+brand);
		System.out.println("Model is :"+model);
		System.out.println("Price is :"+price);
	}
}
