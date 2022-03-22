package uk.madewithbits.algorithms.sorting.smart;

import static java.lang.System.out;

import java.util.Arrays;

public class HeapSort {

	public static void sort(final int[] numbers) {
		out.format("numbers:   %s\n", Arrays.toString(numbers));
		int last = numbers.length - 1;
		while(last > 1) {
			heapify(numbers, last);
			swap(numbers, 0, last);
			out.format("numbers:   %s\n", Arrays.toString(numbers));
			last--;
		}
	}

	private static void swap(final int[] numbers, final int position1, final int position2) {
		final int temp = numbers[position1];
		numbers[position1] = numbers[position2];
		numbers[position2] = temp;
	}

	private static void heapify(final int[] numbers, final int last) {
		for(int i = last / 2; i >= 0; i--) {
			moveDown(numbers, i, last);
		}
	}

	private static void moveDown(int[] numbers, int position, int last) {
		while(position * 2 + 1 <= last) {
			//out.format("movingItem: %d\n", numbers[position]);
			final int maxChildPositioin = findMaxChildPosition(numbers, position, last);
			if(numbers[position] < numbers[maxChildPositioin]) {
				swap(numbers, position, maxChildPositioin);
			}
			//out.format("afterMove: %s\n", Arrays.toString(numbers));
			position = maxChildPositioin;	
		}
	}

	private static int findMaxChildPosition(int[] numbers, int position, int last) {
		if(position * 2 + 2 <= last && numbers[position * 2 + 2] > numbers[position * 2 + 1]) {
			return position * 2 + 2;
		} else {
			return position * 2 + 1;
		}
	}

}
