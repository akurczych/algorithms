package uk.madewithbits.algorithms.tree;

import static java.lang.System.out;

import java.util.Arrays;

public class BinaryHeap {

	private Integer[] values;
	private int currentSize;

	public BinaryHeap(final int size) {
		values = new Integer[size + 1];
		values[0] = 0;
		currentSize = 0;
	}

	public void insert(final Integer value) {
		out.format("Inserting: %d ", value);
		values[++currentSize] = value;
		moveUp(currentSize);
	}

	public Integer findMin() {
		return values[1];
	}

	private void moveUp(int position) {
		while (position / 2 > 0 && values[position] < values[position / 2]) {
			final Integer temp = values[position / 2];
			values[position / 2] = values[position];
			values[position] = temp;
			position = position / 2;
		}
		out.println(Arrays.toString(values));
	}

}
