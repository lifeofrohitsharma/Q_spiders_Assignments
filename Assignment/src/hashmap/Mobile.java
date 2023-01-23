package hashmap;

/* -CREATE A CLASS MOBILE AND STORER MOBILE OBJECT INTO HASHMAP
 * -CREATE CONSTRUCTOR IN MOBILE CLASS
 * -OVERRIDE TOSTRING METHOD IN MOBILE CLASS
 * -CREATE ANOTHER CLASS MOBILE STORE AND CREATE HASHMAP OBJECT, AND ADD MOBILE OBJECT INTO THE HASHMAP CREATED.
 * -KEY SHOULD BE INTEGER TYPE AND VALUE OBJECT TYPE
 * -ADD 5 OBJECT OF MOBILE
 * -REMOVE ONE MOBILE OBJECT.
 * -PRINT VALUES ONLY.
 * -KEYS ONLY.
 * -ENTRY ONLY.
 */
public class Mobile {
	String brand;
	float price;

	public Mobile(String brand, float price) {
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + "]";
	}
}
