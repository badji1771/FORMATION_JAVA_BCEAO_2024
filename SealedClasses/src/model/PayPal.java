package model;

public final class PayPal extends PayementMethod {

	@Override
	String welcomeMessage() {
		return "PayPal payment method";
	}
	
	void paypalMethod() {
		System.out.println("paypalMethod");
	}
}
