package model;

public class PaymentProcessor {

	public void processPayment(PayementMethod payementMethod,double amount) {
		switch (payementMethod) {
		case CreditCard cc -> {
			cc.welcomeMessage();
			cc.creditMethod();
		}
		case DebitCard dc ->{
			dc.welcomeMessage();
			dc.debitMethod();
		}
		case PayPal pa ->{
			pa.welcomeMessage();
			pa.paypalMethod();
		}
		case null -> System.out.println("pas de valeur");
		default->System.out.println("Unrecognized payment method");
			
		}
	}
}
