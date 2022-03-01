package uk.madewithbits.algorithms.tree.aoa;

import static java.util.Objects.nonNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class BinaryTree {

	@Getter
	@Setter
	private Integer key;
	
	@Getter
	private BinaryTree leftChild;
	@Getter
	private BinaryTree rightChild;
	
	public BinaryTree(Integer key) {
		this.key = key;
	}
	
	public BinaryTree insertLeft(final BinaryTree binaryTree) {
		if(leftChild == null) {
			leftChild = binaryTree;
		} else {
			final BinaryTree temp = leftChild;
			leftChild = binaryTree;
			binaryTree.leftChild = temp;
		}
		return this;
	}
	
	public BinaryTree insertRight(final BinaryTree binaryTree) {
		if(rightChild == null) {
			rightChild = binaryTree;
		} else {
			final BinaryTree temp = rightChild;
			rightChild = binaryTree;
			binaryTree.rightChild = temp;
		}
		return this;
	}
	
	public void preOrderTraversal(final List<Integer> keys) {
		keys.add(key);
		if(nonNull(leftChild)) {
			leftChild.preOrderTraversal(keys);
		}
		if(nonNull(rightChild)) {
			rightChild.preOrderTraversal(keys);
		}
	}
	
	public void inOrderTraversal(final List<Integer> keys) {
		if(nonNull(leftChild)) {
			leftChild.inOrderTraversal(keys);
		}
		keys.add(key);
		if(nonNull(rightChild)) {
			rightChild.inOrderTraversal(keys);
		}
	}
	
	public void postOrderTraversal(final List<Integer> keys) {
		if(nonNull(leftChild)) {
			leftChild.postOrderTraversal(keys);
		}
		if(nonNull(rightChild)) {
			rightChild.postOrderTraversal(keys);
		}
		keys.add(key);
	}
}
