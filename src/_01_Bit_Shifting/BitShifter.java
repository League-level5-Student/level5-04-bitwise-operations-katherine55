package _01_Bit_Shifting;

public class BitShifter {
	public static void main(String[] args) {
		/* 1. Jot down the value of num in binary.
		
		0	0	0	0	0	0
	    32	16	8	4	2	1
		
		*/
		
		int num = 4; // 100
		int numShifted = num << 1; // 1000
		
		System.out.println(numShifted);
		
		
		// 2. Print the value of numShifted, and convert that value to binary.
		
		// 3. Compare the two binary values. Can you figure out what the << operator is for?
		
		// 4. Try shifting num 3 places.
		
		// FYI: Binary values can be shifted to the right as well using the >> operator.	
	}
}
