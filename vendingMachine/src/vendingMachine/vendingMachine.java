package vendingMachine;

import java.util.Scanner;

import functionLayer.Payment;
import functionLayer.SelectItem;
import functionLayer.dispenser;

public class vendingMachine {
	static Scanner s = new Scanner(System.in);

	public static void main(String args[]) {

		while (true) {
			System.out.println("1: Select Item");
			System.out.println("2: Enter Payment");
			if (SelectItem.getSelectedItem() != null) {
				System.out.println("3: Dispense Item");
			}
			if (Payment.getBalance() > 0) {
				System.out.println("4: Get change");
				System.out.println("Current Balance: " + Payment.getBalance());
			}
			String input = s.nextLine();

			switch (input) {
			case "1":
				SelectItem.selectItem(s);
				break;
			case "2":
				System.out.println("Enter Amount: ");
				String sBalance = s.nextLine();
				double balance = Double.parseDouble(sBalance);
				Payment.makePayment(balance); // adds to the balance;
				break;
			case "3":
				int token = dispenser.dispenseItem();
				switch (token) {
				case 0:
					System.out.println("Not enough balance!");
					break;
				case 1:
					System.out.println("Dispensed!");
					break;
				case 2:
					System.out.println("Item out of stock!");
					break;

				}
				break;
			case "4":
				System.out.println("Returning " + Payment.getBalance());
				Payment.getChange();
				break;
			}
		}
	}

}
