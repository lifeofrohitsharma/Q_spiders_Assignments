package Interface;

import java.util.Scanner;

class ICICI extends RBI implements ATM {
	int pin;
	long acno;
	double bal;

	public ICICI(long acno, int pin, double bal) {
		this.acno = acno;
		this.pin = pin;
		this.bal = bal;
	}

	void showLoanInterestRate() {
		System.out.println("Loan interest are :9.20%");
	}

	void showDepositRate() {
		System.out.println("Deposit Rate is : 7.2%");
	}

	public void withdrawMoney() {
		System.out.println("Enter the PIN :");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		if (this.pin == pin) {
			System.out.println("Enter the Amount :");
			double amount = sc.nextDouble();
			bal = bal - amount;
		} else
			System.out.println("You have entered a Wrong Pin :");
	}

	public void changePin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your PIN");
		int pin = sc.nextInt();
		if (this.pin == pin) {
			System.out.println("Enter your new Pin :");
			int newpin = sc.nextInt();
			this.pin = newpin;
			System.out.println("Your Pin updated Succesfully :");
		} else {
			System.out.println("You have entered the Wrong PIN:");
		}
	}

	public void checkBalance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Yor PIN:");
		int pin = sc.nextInt();
		if (this.pin == pin) {
			System.out.println("your Account Balance is " + bal);
		} else {
			System.out.println("You have entered a wrong PIN :");
		}
	}

}
