package uk.madewithbits.algorithms.search.naive;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SequentialSearchTest {

	@Test
	void shouldFindNumber() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean result = SequentialSearch.search(9, numbers);
		assertThat(result).isTrue();
	}
	
	@Test
	void shouldFindNumberAndStop() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean result = SequentialSearch.search(1, numbers);
		assertThat(result).isTrue();
	}
	
	@Test
	void shouldNotFindNumber() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean result = SequentialSearch.search(10, numbers);
		assertThat(result).isFalse();
	}
}