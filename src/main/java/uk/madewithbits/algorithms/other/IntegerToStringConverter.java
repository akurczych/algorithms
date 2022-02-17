package uk.madewithbits.algorithms.other;

public class IntegerToStringConverter {
	private static final String[] CONVERTER = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

	public static String convert(final int integer, final int base) {
		if(integer < base) {
			return CONVERTER[integer];
		} else {
			return convert(integer / base, base) + CONVERTER[integer % base];
		}
	}
}