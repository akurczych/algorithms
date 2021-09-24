package uk.madewithbits.algorithms.sorting.naive;

public final class BubbleSort {

    public static void sort(int[] numbers) {
        for (int passNum = numbers.length - 1; passNum > 0; passNum--) {
            for (int i = 0; i < passNum; i++) {
                exchangeIfLargerThanNext(i, numbers);
            }
        }
    }

    private static void exchangeIfLargerThanNext(int i, int[] numbers) {
        if (numbers[i] > numbers[i + 1]) {
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;
        }
    }
}