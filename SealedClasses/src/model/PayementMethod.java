package model;

public sealed class PayementMethod permits CreditCard,DebitCard,PayPal{
	
	String welcomeMessage() {
		return "general payment method";
	}

}
