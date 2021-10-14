package uk.madewithbits.algorithms.sorting.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class SelectionSort {
    
    private final int[] numbers;

    public SelectionSort(int[] numbers) {
        this.numbers = numbers;
        out.format("             numbers %s \n", Arrays.toString(numbers));
    }

    public void sort() {
        for(int fillSlot = numbers.length - 1; fillSlot > 0; fillSlot--) {
            int positionOfMax = 0;
            for(int location = 1; location <= fillSlot; location++) {
                if(numbers[location] > numbers[positionOfMax]) {
                    positionOfMax = location;
                }
            }
            moveMaxToFillSlot(fillSlot, positionOfMax);
            out.format("fillSlot: %d, numbers %s \n", fillSlot, Arrays.toString(numbers));
        }
    }

    private void moveMaxToFillSlot(final int fillSlot, final int positionOfMax) {
        int temp = numbers[fillSlot];
        numbers[fillSlot] = numbers[positionOfMax];
        numbers[positionOfMax] = temp;
    }

}
