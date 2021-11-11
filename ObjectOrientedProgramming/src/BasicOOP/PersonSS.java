package BasicOOP;

public class PersonSS {
	private String address;
	private String firstName;
	private String lastName;

	public PersonSS() {
		System.out.println("Defalt Constructor");

	}

	public PersonSS(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		System.out.println(fn + ln);

	}

	public PersonSS(String fn, String ln, String address) {
		this(fn, ln);
		this.address = address;
		System.out.println(address);
	}

	public static void main(String[] args) {
		PersonSS r = new PersonSS("Abhishek", "lacheta", "Singhana");

	}

}
