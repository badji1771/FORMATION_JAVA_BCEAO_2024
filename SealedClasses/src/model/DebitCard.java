package model;

public final class DebitCard extends PayementMethod {

	@Override
	String welcomeMessage() {
		return "DebitCard payment method";
	}
	
	void debitMethod() {
		System.out.println("debitMethod");
	}
}
