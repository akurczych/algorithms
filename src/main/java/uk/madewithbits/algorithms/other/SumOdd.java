package uk.madewithbits.algorithms.other;

public class SumOdd {

	public static int sumFirstNOddNumbers(final int n) {
		if(n == 1) {
			return 1;
		} else {
			return nthOddNumber(n) + sumFirstNOddNumbers(n - 1);
		}
	}

	private static int nthOddNumber(final int n) {
		return 2 * n - 1;
	}

}
