package uk.madewithbits.algorithms.search.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class OrderedSequentialSearch {
	public static boolean search(int number, int[] numbers) {
		out.format("searching for %d in %s\n", number, Arrays.toString(numbers));
		int position = 0;
		boolean found = false;
		while(position < numbers.length && !found) {
			if (numbers[position] == number) {
				found = true;
			}
			else {
				if(numbers[position] > number) {
					out.println("stopped");
					break;
				} else {
					position++;
				}
			}
		}
		out.format("found: %b\n", found);
		return found;
	}
}
