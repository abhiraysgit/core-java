package BasicOOP;

public class Addition {// Method overloding
	public void Add(int a, int b) {
		System.out.println(a + b);

	}

	public void Add(int a, int b, int c) {
		System.out.println(a + b+c);
	}

	public void Add(int a, int b, float c) {
		System.out.println(a + b+c);
	}

	public static void main(String[] args) {
		Addition a = new Addition();
		a.Add(5, 10);
		a.Add(3, 5, 45);

	}

}
