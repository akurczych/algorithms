package uk.madewithbits.algorithms.other;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExponentiationTest {

	@Test
	void shouldCalculateExponentiation() {
		final int result = Exponentiation.calculate(10, 3);
		assertThat(result).isEqualTo(1000);
	}
	
	@Test
	void shouldCalculateExponentiationFast() {
		final int result = Exponentiation.calculateFast(10, 3);
		assertThat(result).isEqualTo(1000);
	}
	
}
