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

	public static void sortRecursively(final int[] numbers, final int startPosition) {
		if(startPosition == 0) {
			return;
		} else {
			sortRecursively(numbers, startPosition - 1);
			out.format("startPosition: %d, numbers: %s \n", startPosition, Arrays.toString(numbers));
			int currentValue = numbers[startPosition];
			int position = startPosition;
			while(position > 0 && numbers[position - 1] > currentValue) {
				numbers[position] = numbers[position - 1];
				position--;
			}
			numbers[position] = currentValue;
		}
	}
}