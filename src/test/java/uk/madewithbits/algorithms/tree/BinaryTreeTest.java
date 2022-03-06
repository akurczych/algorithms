package uk.madewithbits.algorithms.tree;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void shouldTraversUsingPreOrder() {
		BinaryTree tree = 
				new BinaryTree(1)
					.insertLeft(new BinaryTree(2)
						.insertLeft(new BinaryTree(3))
						.insertRight(new BinaryTree(4)))
					.insertRight(new BinaryTree(5)
						.insertLeft(new BinaryTree(6)));
		
		List<Integer> values = new ArrayList<>();
		tree.preOrderTraversal(values);
		assertThat(values).containsExactly(1, 2, 3, 4, 5, 6);
	}
	
	@Test
	void shouldTraversUsingInOrder() {
		BinaryTree tree = 
				new BinaryTree(4)
					.insertLeft(new BinaryTree(2)
						.insertLeft(new BinaryTree(1))
						.insertRight(new BinaryTree(3)))
					.insertRight(new BinaryTree(6)
						.insertLeft(new BinaryTree(5)));
		
		List<Integer> values = new ArrayList<>();
		tree.inOrderTraversal(values);
		assertThat(values).containsExactly(1, 2, 3, 4, 5, 6);
	}
	
	@Test
	void shouldTraversUsingPostOrder() {
		BinaryTree tree = 
				new BinaryTree(6)
					.insertLeft(new BinaryTree(3)
						.insertLeft(new BinaryTree(1))
						.insertRight(new BinaryTree(2)))
					.insertRight(new BinaryTree(5)
						.insertLeft(new BinaryTree(4)));
		
		List<Integer> values = new ArrayList<>();
		tree.postOrderTraversal(values);
		assertThat(values).containsExactly(1, 2, 3, 4, 5, 6);
	}

}
