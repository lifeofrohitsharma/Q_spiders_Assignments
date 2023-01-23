package MultiLevel;

public class ElectricCar extends Car {
	String chargingcap;
	ElectricCar(String brand, double price, String color, String model, String chargingcap) {
		super(brand, price, color, model);
		this.chargingcap=chargingcap;
	}

	void detailsElecCar()	{
		System.out.println("Brand of Vehicle :"+brand);
		System.out.println("Price of Vehicle :"+price);
		System.out.println("Color of Vehicle :"+color);
		System.out.println("Model of Vehicle :"+model);
		System.out.println("Model of Vehicle :"+chargingcap);

	}
}
