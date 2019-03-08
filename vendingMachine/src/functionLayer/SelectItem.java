package functionLayer;

import java.util.Scanner;

import dataLayer.Drink;
import dataLayer.Item;
import dataLayer.ItemList;
import dataLayer.Snack;

public class SelectItem {

	public static void selectItem(Scanner s) {

		System.out.println("1: Select Snack");
		System.out.println("2: Select Drink");
		String input = s.nextLine();
		switch (input) {
		case "1":
			ItemList.selectedItem = SelectItem.selectSnack(s);
		case "2":
			ItemList.selectedItem = SelectItem.selectDrink(s);
		}
		ItemList.selectedItem = null;
	}

	public static Snack selectSnack(Scanner s) {
		for (int i = 0; i < ItemList.snacks.length; i++) {
			System.out.println(i + ": " + ItemList.snacks[i].name);
		}
		String input = s.nextLine();
		int snackNumber = Integer.parseInt(input);
		return ItemList.snacks[snackNumber];

	}

	public static Drink selectDrink(Scanner s) {
		for (int i = 0; i < ItemList.drinks.length; i++) {
			System.out.println(i + ": " + ItemList.drinks[i].name);
		}
		String input = s.nextLine();
		int drinkNumber = Integer.parseInt(input);
		return ItemList.drinks[drinkNumber];

	}

	public static Item getSelectedItem() {
		return ItemList.selectedItem;
	}
}
