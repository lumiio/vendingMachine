package functionLayer;

public class Payment {
	private static double balance = 0;

	public Payment() {
		balance = 0;
	}

	public static double getBalance() {
		return balance;
	}

	public static void setBalance(double balance) {
		Payment.balance = balance;
	}

	public static void getChange() {
		balance = 0;

	}

	public static void makePayment(Double balance) {
		Payment.balance = Payment.balance + balance;
	}
}
