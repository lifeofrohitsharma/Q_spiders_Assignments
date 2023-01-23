package multiLevelUsingSuper;

public class Manpower extends BbkElectronics {
	long manpower;

	Manpower(String industry, String product, String brand1, String brand2, String brand3, long manpower) {
		super(industry, product, brand1, brand2, brand3);
		this.manpower = manpower;
	}

	void displayBbkElectronics() {
		System.out.println("Industry is : " + industry);
		System.out.println("Product is :" + product);
		System.out.println("Sub Brand is :" + brand1);
		System.out.println("Sub Brand is :" + brand2);
		System.out.println("Sub Brand is :" + brand3);
		System.out.println("Manpower is :" + manpower);

	}
}