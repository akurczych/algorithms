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
	
	@Test
	void shouldRemoveMin() {
		heap = new BinaryHeap(10);
		insertValues(new int[] {19, 33, 11, 17, 5, 27, 21, 14, 18, 9});
		assertThat(heap.removeMin()).isEqualTo(5);
		assertThat(heap.removeMin()).isEqualTo(9);
		assertThat(heap.removeMin()).isEqualTo(11);
		assertThat(heap.removeMin()).isEqualTo(14);
		assertThat(heap.removeMin()).isEqualTo(17);
		assertThat(heap.removeMin()).isEqualTo(18);
		assertThat(heap.removeMin()).isEqualTo(19);
		assertThat(heap.removeMin()).isEqualTo(21);
		assertThat(heap.removeMin()).isEqualTo(27);
		assertThat(heap.removeMin()).isEqualTo(33);
	}
	
	@Test
	void shouldBuildBinaryHeap() {
		heap = new BinaryHeap(new Integer[] {19, 33, 11, 17, 5, 27, 21, 14, 18, 9});
		assertThat(heap.findMin()).isEqualTo(5);
	}

	private void insertValues(final int[] values) {
		for(int i = 0; i < values.length; i++) {
			heap.insert(values[i]);
		}
	}

}
