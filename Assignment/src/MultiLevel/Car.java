package MultiLevel;
public class Car extends Vehicle{
	String model;

	Car(String brand, double price, String color, String model) {
		super(brand, price, color);
		this.model=model;
		}
		void detailsCar()
		{
			System.out.println("Brand of Vehicle :"+brand);
			System.out.println("Price of Vehicle :"+price);
			System.out.println("Color of Vehicle :"+color);
			System.out.println("Model of Vehicle :"+model);
						
	}
	
}
