package uk.madewithbits.algorithms.sorting.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(final int[] numbers) {
    	out.format("            numbers %s \n", Arrays.toString(numbers));
    	final var result = numbers.clone();
        for(int fillSlot = numbers.length - 1; fillSlot > 0; fillSlot--) {
            int positionOfMax = 0;
            for(int location = 1; location <= fillSlot; location++) {
                if(result[location] > result[positionOfMax]) {
                    positionOfMax = location;
                }
            }
            int temp = result[fillSlot];
            result[fillSlot] = result[positionOfMax];
            result[positionOfMax] = temp;
            out.format("fillSlot: %d, result %s \n", fillSlot, Arrays.toString(result));
        }
        return result;
    }
}
