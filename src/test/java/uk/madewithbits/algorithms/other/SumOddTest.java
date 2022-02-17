package uk.madewithbits.algorithms.other;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SumOddTest {

	@Test
	void shouldCalculateSumOfOddNumbers() {
		final int result = SumOdd.sumFirstNOddNumbers(5);
		assertThat(result).isEqualTo(25);
	}

}
