package model;

public class NamePhoneEmail {
	String name;
	String phonenum;
	String email;

	public NamePhoneEmail(String n, String p, String e) {
		name = n;
		phonenum = p;
		email = e;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "NamePhoneEmail [name=" + name + ", phonenum=" + phonenum + ", email=" + email + "]";
	}
}
