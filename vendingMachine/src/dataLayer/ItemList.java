package dataLayer;

public class ItemList {
	public static Item selectedItem = null;

	static public Snack chips = new Snack("Chips", 3, false, 1.5);
	static public Snack gfSnack = new Snack("Gluten Free Snack", 5, true, 2.5);

	static public Drink coke = new Drink("Coke", 4, false, 2);
	static public Drink dietCoke = new Drink("Diet Coke", 6, true, 2.5);
	static public Drink pepsi = new Drink("Pepsi", 5, false, 2);
	static public Drink dietPepsi = new Drink("Diet Pepsi", 7, true, 2.5);
	static public Drink mountainDew = new Drink("Mountain Dew", 3, false, 2);
	static public Drink dietMountDew = new Drink("Diet Mountain Dew", 2, true, 2.5);

	static public Snack[] snacks = { chips, gfSnack };
	static public Drink[] drinks = { coke, dietCoke, pepsi, dietPepsi, mountainDew, dietMountDew };
}
