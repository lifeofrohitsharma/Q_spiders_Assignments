package multiLevelUsingSuper;

public class BbkElectronics extends Mobile {
	String brand1;
	String brand2;
	String brand3;

	BbkElectronics(String industry, String product, String brand1, String brand2, String brand3) {
		super(industry, product);
		this.brand1 = brand1;
		this.brand2 = brand2;
		this.brand3 = brand3;
	}

	void displayBbkElectronics() {
		System.out.println("Industry is : " + industry);
		System.out.println("Product is :" + product);
		System.out.println("Sub Brand is :" + brand1);
		System.out.println("Sub Brand is :" + brand2);
		System.out.println("Sub Brand is :" + brand3);

	}

}
