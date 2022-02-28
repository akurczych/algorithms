package uk.madewithbits.algorithms.sorting.smart;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void sort(final int[] numbers) {
		sortHelper(numbers, 0, numbers.length - 1);
	}
	
	private static void sortHelper(final int[] numbers, final int first, final int last) {
		if(first < last) {
			choosePivot(numbers, first, last);
			out.format("first: %d, last: %d\n", first, last);
			out.format("numbers: %s\n", Arrays.toString(numbers));
			final int splitPoint = partition(numbers, first, last);
			sortHelper(numbers, first, splitPoint - 1);
			sortHelper(numbers, splitPoint + 1, last);
		}
	}
	
	private static int partition(final int[] numbers, final int first, final int last) {
		final int pivotValue = numbers[first];
		int leftMark = first + 1;
		int rightMark = last;
		boolean done = false;
		while(!done) {
			while(leftMark <= rightMark && numbers[leftMark] <= pivotValue) {
				leftMark++;
			}
			while(numbers[rightMark] >= pivotValue && rightMark >= leftMark) {
				rightMark--;
			}
			if(rightMark < leftMark) {
				done = true;
			} else {
				int temp = numbers[leftMark];
				numbers[leftMark] = numbers[rightMark];
				numbers[rightMark] = temp;
			}	
		}
		int temp = numbers[first];
		numbers[first] = numbers[rightMark];
		numbers[rightMark] = temp;
		
		return rightMark;
	}
	
	private static void choosePivot(final int[] numbers, final int first, final int last) {
		final int pivot = new Random().nextInt(first, last + 1);
		final int temp = numbers[first];
		numbers[first] = numbers[pivot];
		numbers[pivot] = temp;
	}

}
