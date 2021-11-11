package BasicOOP;

import java.util.*;

public class Person1 {
	private String name = null;
	private Date dob;
	private String address = null;

	public Person1(String name,Date dob,String address) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 */

	public Date getDob() {
		return dob;
	}

	/*
	 * public void setDob(Date dob) { this.dob = dob; }
	 */

	public String getAddress() {
		return address;
	}

	/*
	 * public void setAddress(String address) { this.address = address; }
	 */

}
