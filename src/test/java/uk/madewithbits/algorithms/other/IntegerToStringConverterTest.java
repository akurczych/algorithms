package uk.madewithbits.algorithms.other;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class IntegerToStringConverterTest {

	@Test
	void shouldConvertToBinary() {
		final String result = IntegerToStringConverter.convert(10, 2);
		assertThat(result).isEqualTo("1010");
	}
	
	@Test
	void shouldConvertToDecimal() {
		final String result = IntegerToStringConverter.convert(2468, 10);
		assertThat(result).isEqualTo("2468");
	}
	
	@Test
	void shouldConvertToHexadecimal() {
		final String result = IntegerToStringConverter.convert(2468, 16);
		assertThat(result).isEqualTo("9A4");
	}

}
