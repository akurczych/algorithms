package uk.madewithbits.algorithms.other;

public class Exponentiation {

	public static int calculate(final int base, final int exponent) {
		int result = 1;
		for(int i = 0; i < exponent; i++) {
			result = result * base;
		}
		return result;
	}
	
	public static int calculateFast(final int aBase, final int anExponent) {
		int base = aBase;
		int exponent = anExponent;
		int result = 1;
		while (exponent > 0) {
			if (exponent % 2 != 0) {
				result = result * base;
			}
			base = base * base;
			exponent = exponent / 2;
		}
		return result;
		
	}

}
