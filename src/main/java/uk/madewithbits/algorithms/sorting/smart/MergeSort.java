package uk.madewithbits.algorithms.sorting.smart;

import static java.lang.System.out;

import java.util.Arrays;

public class MergeSort {

	public static void sort(final int[] numbers) {
		out.format("Splitting %s\n", Arrays.toString(numbers));
		if(numbers.length > 1) {
			final int midpoint = numbers.length / 2;
			final int[] leftHalf = Arrays.copyOfRange(numbers, 0, midpoint);
			final int[] rightHalf = Arrays.copyOfRange(numbers, midpoint, numbers.length);
			
			sort(leftHalf);
			sort(rightHalf);
		
			int i = 0, j = 0, k = 0;
			while (i < leftHalf.length && j < rightHalf.length) {
				if(leftHalf[i] < rightHalf[j]) {
					numbers[k] = leftHalf[i];
					i++;
				} else {
					numbers[k] = rightHalf[j];
					j++;
				}
				k++;
			}
			while(i < leftHalf.length) {
				numbers[k] = leftHalf[i];
				i++;
				k++;
			}
			while(j < rightHalf.length) {
				numbers[k] = rightHalf[j];
				j++;
				k++;
			}
		}
		out.format("Merging %s\n", Arrays.toString(numbers));
	}
}
