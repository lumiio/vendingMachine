package dataLayer;

public class Snack extends Item {
	boolean glutenFree;

	public Snack(String name, int count, boolean glutenFree, double price) {
		this.name = name;
		this.count = count;
		this.glutenFree = glutenFree;
		this.price = price;
	}

}
