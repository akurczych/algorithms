package uk.madewithbits.algorithms.other;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void shouldCalculateFactorial() {
		final int result = Factorial.calculateFactorial(6);
		assertThat(result).isEqualTo(720);
	}

}
