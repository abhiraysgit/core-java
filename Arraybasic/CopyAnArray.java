package Arraybasic;

public class CopyAnArray {
	public static void main(String[] args) {
		char[] copyFrom = { 'a', 's', 'd', 'e', 't', 'm', 'n', 'g', 'j' };
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 3, copyTo, 0, 4);
		System.out.println(new String(copyTo));

	for (char c : copyTo) {
		
		System.out.println(c);
	}
	}

}
