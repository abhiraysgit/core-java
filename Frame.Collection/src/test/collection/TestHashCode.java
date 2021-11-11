package test.collection;

public class TestHashCode {
	public static void main(String[] args) {
		String s = "Ajay";
		String s1 = "Ajay";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s.equals(s1));
	}

}
