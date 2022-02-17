package uk.madewithbits.algorithms.other;

import static java.lang.System.out;
import static java.util.Arrays.copyOfRange;

public class Sum {

	public static int sum(final int[] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum = sum + number;
			out.format("adding %d\n", number);
		}
		return sum;
	}

	public static int sumRecursively(final int[] numbers) {
		out.format("adding %d\n", numbers[0]);
		if(numbers.length == 1) {
			return numbers[0];
		} else {
			return numbers[0] + sumRecursively(copyOfRange(numbers, 1, numbers.length));
		}
	}
}
