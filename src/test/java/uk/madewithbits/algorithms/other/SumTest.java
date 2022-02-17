package uk.madewithbits.algorithms.other;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void shouldSumNumbers() {
		final int[] numbers = {1, 3, 5, 7, 9};
		final int sum = Sum.sum(numbers);
		assertThat(sum).isEqualTo(25);
	}
	
	@Test
	void shouldSumNumbersRecursively() {
		final int[] numbers = {1, 3, 5, 7, 9};
		final int sum = Sum.sumRecursively(numbers);
		assertThat(sum).isEqualTo(25);
	}

}
