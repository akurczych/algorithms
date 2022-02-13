package uk.madewithbits.algorithms.sorting.naive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
	
	@Test
	void shouldSort() {
		final int[] numbers = {9, 9, 7, 6, 5, 4, 3, 2, 1};
		final int[] result = BubbleSort.sort(numbers);
		assertThat(result).containsExactly(1, 2, 3, 4, 5, 6, 7, 9, 9);
	}

}
