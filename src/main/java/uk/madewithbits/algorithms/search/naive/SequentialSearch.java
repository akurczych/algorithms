package uk.madewithbits.algorithms.search.naive;

public class SequentialSearch {

	public static boolean search(int[] numbers, int i) {
		int position = 0;
		boolean found = false;
		while(position < numbers.length && !found) {
			if (numbers[position] == i) {
				found = true;
			}
			else {
				position++;
			}
		}
		return found;
	}
}
