package model;

import java.util.Random;

public class Invoice {
	private String title;
	private int id;
	private Double amount;
	
	
	private static int nextId=1;
	private static final String[] TAB= {"a","b","c"};
	
	
	
	
	
	public Invoice(String title, int id, Double amount) {
		super();
		this.title = title;
		this.id = id;
		this.amount = amount;
	}
	
	public Invoice(Double amount) {
		super();
		this.title = TAB[new Random().nextInt(3)];
		this.id = nextId++;
		this.amount = amount;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Invoice [title=" + title + ", id=" + id + ", amount=" + amount + "]";
	}
	
	

}
