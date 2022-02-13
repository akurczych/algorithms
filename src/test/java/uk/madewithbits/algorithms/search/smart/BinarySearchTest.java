package uk.madewithbits.algorithms.search.smart;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

	@Test
	void shouldFindNumberFirstInArray() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean found = BinarySearch.search(0, numbers);
		assertThat(found).isTrue();
	}
	
	@Test
	void shouldFindNumberLastInArray() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean found = BinarySearch.search(9, numbers);
		assertThat(found).isTrue();
	}
	
	@Test
	void shouldFindNumber() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean found = BinarySearch.search(3, numbers);
		assertThat(found).isTrue();
	}
	
	@Test
	void shouldNotFindNumber() {
		final int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final boolean found = BinarySearch.search(10, numbers);
		assertThat(found).isFalse();
	}
}