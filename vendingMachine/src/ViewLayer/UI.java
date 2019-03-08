package ViewLayer;

import dataLayer.ItemList;
import functionLayer.Payment;
import functionLayer.SelectItem;

public class UI {
	public static void printFirst() {
		System.out.println("1: Select Item");
		System.out.println("2: Enter Payment");
		if (SelectItem.getSelectedItem() != null) {
			System.out.println("3: Dispense Item");
		}
		if (Payment.getBalance() > 0) {
			System.out.println("4: Get change");
			System.out.println("Current Balance: " + Payment.getBalance());
		}
	}

	public static void enterAmount() {
		System.out.println("Enter Amount: ");
	}

	public static void dispenseMessage(int token) {
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
	}

	public static void returnBalance() {
		System.out.println("Returning " + Payment.getBalance());
	}

	public static void printSnacks() {
		for (int i = 0; i < ItemList.snacks.length; i++) {
			System.out.println(i + ": " + ItemList.snacks[i].name);
		}
	}

	public static void printDrinks() {
		for (int i = 0; i < ItemList.drinks.length; i++) {
			System.out.println(i + ": " + ItemList.drinks[i].name);
		}
	}

	public static void printItemSelection() {
		System.out.println("1: Select Snack");
		System.out.println("2: Select Drink");
	}
}
