package _03_Printing_Binary;

public class BinaryPrinter {
	// Complete the methods below so they print the passed in parameter in binary.
	// Use bit shifting and bit masking to print the binary numbers.
	// Do not use the Integer.toBinaryString method!
	// Don't be afraid to use the methods that are already complete to finish the
	// others.
	// Create a main method to test your methods.

	/*
	 * 
	 * 0 0 0 0 0 0 32 16 8 4 2 1
	 * 
	 */

	public static void main(String[] args) {
		BinaryPrinter jo = new BinaryPrinter();
		jo.printIntBinary(49);
	}

	public void printByteBinary(byte b) {
		String end = "";
		byte binary[] = new byte[10];
		int counter = 0; 
		while (b > 0) {
			binary[counter++] = (byte) (b%2);
			b = (byte) (b/2);
		}
		for(int j = counter -1; j>=0; j--) {
			end+=binary[j];
		}
		System.out.println(end);
	}

	public void printShortBinary(short s) {
		String end = "";
		short binary[] = new short[10];
		int counter = 0; 
		while (s > 0) {
			binary[counter++] = (short) (s%2);
			s = (short) (s/2);
		}
		for(int j = counter -1; j>=0; j--) {
			end+=binary[j];
		}
		System.out.println(end);
	}

	public void printIntBinary(int i) {
		String end = "";
		int binary[] = new int[50];
		int counter = 0;
		while (i > 0) {
			binary[counter++] = i % 2;
			i = i / 2;
		}
		for (int j = counter - 1; j >= 0; j--) {
			end += binary[j];
		}
		System.out.println(end);
	}

	public void printLongBinary(long l) {
		String end = "";
		long binary[] = new long[50];
		int counter = 0;
		while (l > 0) {
			binary[counter++] = l % 2;
			l = l / 2;
		}
		for (int j = counter - 1; j >= 0; j--) {
			end += binary[j];
		}
		System.out.println(end);
	}
}
