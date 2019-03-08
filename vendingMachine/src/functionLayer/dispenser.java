package functionLayer;

import dataLayer.ItemList;

public class dispenser {
	public static int dispenseItem() {
		if (ItemList.selectedItem.count > 0) {
			if (ItemList.selectedItem.price > Payment.getBalance()) {
				return 0;
			} else {
				ItemList.selectedItem = null;
				Payment.setBalance(Payment.getBalance() - ItemList.selectedItem.price);
				return 1;
			}
		} else {
			return 2;
		}
	}

}
