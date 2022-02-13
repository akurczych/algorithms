package uk.madewithbits.algorithms.search.smart;

import static java.lang.System.out;

import java.util.Arrays;

public class BinarySearch {

	public static boolean search(final int number, final int[] numbers) {
		out.format("searching for %d in %s\n", number, Arrays.toString(numbers));
		boolean found = false;
		int first = 0;
		int last = numbers.length - 1;
		while (first <= last && !found) {
			int midpoint = (first + last) / 2;
			print(numbers, first, last, midpoint);
			if (numbers[midpoint] == number) {
				found = true;
			} else {
				if (number < numbers[midpoint]) {
					last = midpoint - 1;
				} else {
					first = midpoint + 1;
				}
			}
		}
		out.format("found: %b\n", found);
		return found;
	}

	private static void print(final int[] numbers, int first, int last, int midpoint) {
		out.format("first: %d, last: %d, midpoint: %d\n",
				   numbers[first],
				   numbers[last],
				   numbers[midpoint]);
	}

}
