package uk.madewithbits.algorithms.sorting.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class InsertionSort {

	public static int[] sort(final int[] numbers) {
		final var result = numbers.clone();
		for (int index = 1; index < result.length; index++) {
			out.format("index: %d, result: %s \n", index, Arrays.toString(result));
			int currentValue = result[index];
			int position = index;
			while (position > 0 && result[position - 1] > currentValue) {
				result[position] = result[position - 1];
				position--;
			}
			result[position] = currentValue;
		}
		return result;
	}
	
}
