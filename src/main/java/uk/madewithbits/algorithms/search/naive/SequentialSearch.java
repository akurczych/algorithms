package uk.madewithbits.algorithms.search.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class SequentialSearch {
	public static boolean search(final int number, final int[] numbers) {
		out.format("searching for %d in %s\n", number, Arrays.toString(numbers));
		int position = 0;
		boolean found = false;
		while(position < numbers.length && !found) {
			if (numbers[position] == number) {
				found = true;
			}
			else {
				position++;
			}
		}
		out.format("found: %b\n", found);
		return found;
	}
}