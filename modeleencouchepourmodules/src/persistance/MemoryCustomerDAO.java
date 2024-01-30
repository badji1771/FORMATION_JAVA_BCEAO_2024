package persistance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class MemoryCustomerDAO implements CustomerDAO{
	
	private static final Map<Integer, Customer> DB = new HashMap<>(); 
	private static Integer id =0;
	
	@Override
	public void save(Customer c) {
		
		c.setId(id); // Artifice pour simuler l'auto icrement d'une db. Ne fait pas tous les cas !
		DB.put(c.getId(), c);
		id++;
	}

	@Override
	public Customer findById(int id) {
		
		return DB.get(id);
	}

	@Override
	public void delete(int id) {

		DB.remove(id);
	}

	@Override
	public List<Customer> findAll() {
		
		return new ArrayList<>(DB.values());
	}

}
