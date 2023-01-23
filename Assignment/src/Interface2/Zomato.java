package Interface2;

//import java.util.Scanner;

class Zomato extends PhonePe implements GoogleMap {
	String username;
	long contact;

	Zomato(String username, long contact, long acno, int pin, double bal) {
		super(acno, pin, bal);
		this.username = username;
		this.contact = contact;
	}

	void payment() {
		System.out.println("Payment Via PhonePe");
	}

	public void view() {
		System.out.println(username);
		System.out.println(contact);
	}
}
