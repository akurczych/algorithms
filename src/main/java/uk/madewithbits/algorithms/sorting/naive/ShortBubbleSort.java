package uk.madewithbits.algorithms.sorting.naive;

import static java.lang.System.out;

import java.util.Arrays;

public class ShortBubbleSort {

    private final int numbers[];
    private int passNum;
    private boolean hasExchanged;

    public ShortBubbleSort(int[] numbers) {
        this.numbers = numbers;
        this.passNum = numbers.length - 1;
        this.hasExchanged = true;
    }

    public void sort() {
        while (passNum > 0 && hasExchanged) {
            out.format("passNum: %d, array: %s \n", passNum, Arrays.toString(numbers));
            iterateOverNumbersComparingAndExchanging();
            passNum--;
        }
        out.format("after       array: %s \n", Arrays.toString(numbers));
    }

    private void iterateOverNumbersComparingAndExchanging() {
        for (int i = 0; i < passNum; i++) {
            if (numbers[i] > numbers[i + 1]) {
                int temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            } else {
                hasExchanged = false;
            }
        }
    }
}
