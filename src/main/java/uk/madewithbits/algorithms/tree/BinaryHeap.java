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
	
	public BinaryHeap(final Integer[] someValues) {
		values = Arrays.copyOf(someValues, someValues.length + 1);
		values[values.length - 1] = 0;
		swap(0, values.length - 1);
		currentSize = values.length - 1;
		for(int i = values.length / 2; i > 0; i--) {
			moveDown(i);
		}
		out.format("values: %s\n", Arrays.toString(this.values));
	}
	
	public Integer findMin() {
		return values[1];
	}

	public void insert(final Integer value) {
		out.format("Inserting: %d ", value);
		values[++currentSize] = value;
		moveUp(currentSize);
	}
	
	public Integer removeMin() {
		final Integer min = values[1];
		values[1] = values[currentSize];
		values[currentSize] = null;
		currentSize--;
		moveDown(1);
		out.format("Removing: %d\n", min);
		return min;
	}

	private void moveDown(Integer position) {
		while(position * 2 <= currentSize) {
			final Integer minChildPosition = findMinChildPosition(position);
			if(values[position] > values[minChildPosition]) {
				swap(position, minChildPosition);
			}
			position = position * 2;
		}
	}

	private Integer findMinChildPosition(final Integer position) {
		if(position * 2 + 1 <= currentSize && values[position * 2 + 1] < values[position * 2]) {
			return position * 2 + 1;
		} else {
			return position * 2;
		}
	}

	private void moveUp(Integer position) {
		while (position / 2 > 0) {
			if (values[position] < values[position / 2]) {
				swap(position, position / 2);
			}
			position = position / 2;
		}
		out.println(Arrays.toString(values));
	}

	private void swap(final Integer position1, final Integer position2) {
		final Integer temp = values[position1];
		values[position1] = values[position2];
		values[position2] = temp;
	}

}
