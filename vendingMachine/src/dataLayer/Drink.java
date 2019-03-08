package dataLayer;

public class Drink extends Item {
	boolean diet;

	public Drink(String name, int count, boolean diet, double price) {
		this.name = name;
		this.count = count;
		this.diet = diet;
		this.price = price;
	}

}
