import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String firstName;
	private String lastName;

	private transient String tempValue;

	public Employee() {
	}

	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the tempValue
	 */
	public String getTempValue() {
		return tempValue;
	}

}
