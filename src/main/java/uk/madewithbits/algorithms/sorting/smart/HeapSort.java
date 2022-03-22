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

	private static void heapify(final int[] numbers, final int last) {
		for(int position = last / 2; position >= 0; position--) {
			moveDown(numbers, position, last);
		}
	}

	private static void moveDown(int[] numbers, int position, int last) {
		while(leftChildPosition(position) <= last) {
			final int maxChildPositioin = findMaxChildPosition(numbers, position, last);
			if(numbers[position] < numbers[maxChildPositioin]) {
				swap(numbers, position, maxChildPositioin);
			}
			position = maxChildPositioin;	
		}
	}
	
	private static int findMaxChildPosition(int[] numbers, int position, int last) {
		if(rightChildPosition(position) <= last && numbers[rightChildPosition(position)] > numbers[leftChildPosition(position)]) {
			return rightChildPosition(position);
		} else {
			return leftChildPosition(position);
		}
	}
	
	private static void swap(final int[] numbers, final int position1, final int position2) {
		final int temp = numbers[position1];
		numbers[position1] = numbers[position2];
		numbers[position2] = temp;
	}

	private static int leftChildPosition(int position) {
		return position * 2 + 1;
	}

	private static int rightChildPosition(int position) {
		return position * 2 + 2;
	}

}
