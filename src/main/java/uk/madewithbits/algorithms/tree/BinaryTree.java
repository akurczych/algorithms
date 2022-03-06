package uk.madewithbits.algorithms.tree;

import static java.util.Objects.nonNull;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class BinaryTree {

	@Getter
	@Setter
	private Integer value;
	
	@Getter
	private BinaryTree leftChild;
	@Getter
	private BinaryTree rightChild;
	
	public BinaryTree(Integer value) {
		this.value = value;
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
	
	public void preOrderTraversal(final List<Integer> values) {
		values.add(value);
		if(nonNull(leftChild)) {
			leftChild.preOrderTraversal(values);
		}
		if(nonNull(rightChild)) {
			rightChild.preOrderTraversal(values);
		}
	}
	
	public void inOrderTraversal(final List<Integer> values) {
		if(nonNull(leftChild)) {
			leftChild.inOrderTraversal(values);
		}
		values.add(value);
		if(nonNull(rightChild)) {
			rightChild.inOrderTraversal(values);
		}
	}
	
	public void postOrderTraversal(final List<Integer> values) {
		if(nonNull(leftChild)) {
			leftChild.postOrderTraversal(values);
		}
		if(nonNull(rightChild)) {
			rightChild.postOrderTraversal(values);
		}
		values.add(value);
	}
}
