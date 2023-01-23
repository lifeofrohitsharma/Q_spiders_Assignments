package Interface2;

abstract class PhonePe {
	long acno;
	int pin;
	double bal;

	PhonePe(long acno, int pin, double bal) {
		this.acno = acno;
		this.pin = pin;
		this.bal = bal;
	}

	abstract void view();
}
