package model;

public class Customer {
	
	// Attributs
	private int id;
	private String name;
	
	

	// Constructeurs
	public Customer() {
		this.name = "Default name";
	}
	
	public Customer(String name) {
		this.name = name;
	}

	// Getters & Setters 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "(" + id + ")" + name;
	}
	
	
}
