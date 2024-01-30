package lanch;

import model.CreditCard;
import model.DebitCard;
import model.PayPal;
import model.PaymentProcessor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var cc = new CreditCard();
		var cd = new DebitCard();
		var pa = new PayPal();
		
		var processor = new PaymentProcessor();
		processor.processPayment(cc, 0);
		processor.processPayment(cd, 0);
		processor.processPayment(pa, 0);
	}

}
