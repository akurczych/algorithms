package uk.madewithbits.algorithms.sorting.naive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ShortBubbleSortTest {

    @Test
    void test() {
        int numbers[] = {9, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        new ShortBubbleSort(numbers).sort();
        assertThat(numbers).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
    }

}
