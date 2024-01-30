package presentation;

import model.Customer;
import service.CustomerService;
import service.ServiceImplementation;

public class Presentation {

	public static void main(String[] args) {

		// Initialisations
		CustomerService cs = new ServiceImplementation();

		Customer c1 = null;
		Customer c2 = new Customer("Albert Einstein");
		Customer c3 = new Customer("Giordano Bruno");

		// Scenario
		cs.addCustomer(c1);
		cs.addCustomer(c2);
		cs.addCustomer(c3);
		
		System.out.println(cs.getAllCustomer());
		
		
	}

}
