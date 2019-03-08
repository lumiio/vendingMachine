package functionLayer;

import java.util.Scanner;

import ViewLayer.UI;

public class vendingMachine {
	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {

		while (true) {
			UI.printFirst();
			String input = s.nextLine();

			switch (input) {
			case "1":
				SelectItem.selectItem(s);
				break;
			case "2":
				UI.enterAmount();
				String sBalance = s.nextLine();
				double balance = Double.parseDouble(sBalance);
				Payment.makePayment(balance); // adds to the balance;
				break;
			case "3":
				int token = dispenser.dispenseItem();
				UI.dispenseMessage(token);
				break;
			case "4":
				UI.returnBalance();
				Payment.getChange();
				break;
			}
		}
	}

}
