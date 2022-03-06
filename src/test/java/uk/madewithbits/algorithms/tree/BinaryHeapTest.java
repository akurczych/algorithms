package uk.madewithbits.algorithms.tree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BinaryHeapTest {

	private BinaryHeap heap;
	
	@Test
	void shouldOrderInsertedItems() {
		heap = new BinaryHeap(10);
		insertValues(new int[] {19, 33, 11, 17, 5, 27, 21, 14, 18, 9});
		assertThat(heap.findMin()).isEqualTo(5);
	}

	private void insertValues(final int[] values) {
		for(int i = 0; i < values.length; i++) {
			heap.insert(values[i]);
		}
	}

}
