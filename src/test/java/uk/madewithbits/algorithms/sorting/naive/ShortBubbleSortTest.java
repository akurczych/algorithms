package uk.madewithbits.algorithms.sorting.naive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ShortBubbleSortTest {
    
    @Test
    void shouldSort() {
        final int[] numbers = {1, 2, 3, 4, 5, 6, 9, 8, 7};
        final int[] result = ShortBubbleSort.sort(numbers);
        assertThat(result).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

}
