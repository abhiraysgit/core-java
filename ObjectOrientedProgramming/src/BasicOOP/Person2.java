package BasicOOP;

public class Person2 {
	protected String firstName;
	protected String lastName;

	public Person2() {
		System.out.println("defat constructor");
	}

	public Person2(String fn, String ln) {
		firstName = fn;
		lastName = ln;
		System.out.println("2 perams constructor");
	}
	
	}


