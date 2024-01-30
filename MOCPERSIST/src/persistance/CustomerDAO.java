package persistance;

import java.util.List;

import model.Customer;

public interface CustomerDAO {
	
	public void save(Customer c);
	
	public Customer findById(int id);
	
	public void delete(int id);
	
	public List<Customer> findAll();
}
