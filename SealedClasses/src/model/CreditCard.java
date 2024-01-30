package model;

public final class CreditCard extends PayementMethod {

	@Override
	String welcomeMessage() {
		return "CreditCard payment method";
	}
	void creditMethod() {
		System.out.println("creditMethod");
	}
}
