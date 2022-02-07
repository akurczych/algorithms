package uk.madewithbits.algorithms.sorting.naive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InsertionSortTest {

	@Test
	void shouldSort() {
		int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 9};
		int[] result = InsertionSort.sort(numbers);
		assertThat(result).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);
	}

}
