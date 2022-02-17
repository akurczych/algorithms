package uk.madewithbits.algorithms.other;

public class Factorial {
	public static int calculateFactorial(final int number) {
		if(number == 1) {
			return 1;
		} else {
			return number * calculateFactorial(number - 1);
		}
	}
}
