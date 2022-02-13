package uk.madewithbits.algorithms.sorting.naive;

import static java.lang.System.out;

import java.util.Arrays;

public final class BubbleSort {
    public static int[] sort(final int[] numbers) {
    	out.format("numbers:   %s \n", Arrays.toString(numbers));
    	final int[] result = numbers.clone();
        for (int passNum = result.length - 1; passNum > 0; passNum--) {
            for (int i = 0; i < passNum; i++) {
            	if (result[i] > result[i + 1]) {
                    int temp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = temp;
                }
            }
            out.format("passNum %d: %s \n", passNum, Arrays.toString(result));
        }
        return result;
    }
}