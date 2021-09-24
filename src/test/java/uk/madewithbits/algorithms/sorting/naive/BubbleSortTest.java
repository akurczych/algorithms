package uk.madewithbits.algorithms.sorting.naive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
	
	@Test
	void shouldSort() {
		int numbers[] = {9, 9, 7, 6, 5, 4, 3, 2, 1};
		BubbleSort.sort(numbers);
		assertThat(numbers).containsExactly(1, 2, 3, 4, 5, 6, 7, 9, 9);
	}

}
