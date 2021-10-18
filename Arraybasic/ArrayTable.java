package Arraybasic;

public class ArrayTable {
	public static void main(String[] args) {
		int[] table = new int[10];
		table[0] = 2;
		table[1] = 4;
		table[2] = 6;
		table[3] = 8;
        table[4] = 10;
        table[5] = 12;
		for (int a : table) {
			System.out.print (" "+a);
		}
	}

}
