package model;

public class NamePhone {
	  private String name; 
	  private String phonenum; 
	 
	  public NamePhone(String n, String p) { 
	    name = n; 
	    phonenum = p; 
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	} 
}
