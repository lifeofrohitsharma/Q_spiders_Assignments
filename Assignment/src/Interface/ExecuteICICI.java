package Interface;

import java.util.Scanner;

public class ExecuteICICI {
	public static void main(String[] args) {
		ICICI ob = new ICICI(98543219321l, 1664, 2600d);
		// ob.checkBalance();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Enter your Choice : \n 1: Withdraw \n 2: Check Balance \n 3: Change PIN \n 4: Loan Interest are \n 5: Deposit rate are :");

			int options = sc.nextInt();
			switch (options) {
			case 1:
				ob.withdrawMoney();
				break;
			case 2:
				ob.checkBalance();
				break;
			case 3:
				ob.changePin();
				break;
			case 4:
				ob.showLoanInterestRate();
				break;
			case 5:
				ob.showDepositRate();
				break;
			default:
				System.out.println("Your choice is invalid :");
			}
		} while (true);

	}
}

