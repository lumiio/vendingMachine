package functionLayer;

import java.util.Scanner;

import ViewLayer.UI;
import dataLayer.Drink;
import dataLayer.Item;
import dataLayer.ItemList;
import dataLayer.Snack;

public class SelectItem {

	public static void selectItem(Scanner s) {

		UI.printItemSelection();
		String input = s.nextLine();
		switch (input) {
		case "1":
			ItemList.selectedItem = SelectItem.selectSnack(s);
			break;
		case "2":
			ItemList.selectedItem = SelectItem.selectDrink(s);
			break;
		default:
			ItemList.selectedItem = null;
		}
		
	}

	public static Snack selectSnack(Scanner s) {
		UI.printSnacks();
		String input = s.nextLine();
		int snackNumber = Integer.parseInt(input);
		return ItemList.snacks[snackNumber];

	}

	public static Drink selectDrink(Scanner s) {
		UI.printDrinks();
		String input = s.nextLine();
		int drinkNumber = Integer.parseInt(input);
		return ItemList.drinks[drinkNumber];

	}

	public static Item getSelectedItem() {
		return ItemList.selectedItem;
	}
}
