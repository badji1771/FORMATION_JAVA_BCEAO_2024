package service;

import java.util.List;

import model.Customer;

public interface CustomerService {

	public void addCustomer(Customer c);

	public Customer findValidatedCustomer(int id);

	public List<Customer> getAllCustomer();
	
	public void deleteCustomer(int id);

}
