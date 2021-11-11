package BasicOOP;

public class Employee extends Person2 {
	protected String designation;

	public Employee() {
	}

	public Employee(String fn, String ln, String des) {
		super(fn, ln);
		designation = des;
			}

	public static void main(String[] args) {
		Employee d = new Employee("Abhishek", "lacheta", "Student");
		System.out.println("default"+d.designation);
		System.out.println("2parameter"+d.firstName);
		System.out.println("3PARAMETER"+d.lastName);

	}

}
