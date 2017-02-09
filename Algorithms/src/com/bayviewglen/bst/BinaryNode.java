package com.bayviewglen.bst;

public class BinaryNode {
	
	private BinaryNode leftChild;
	private BinaryNode rightChild;
	private Comparable element;
	
	
	public BinaryNode(Comparable el){
		element = el;
	}
	
	public BinaryNode getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(BinaryNode leftChild) {
		this.leftChild = leftChild;
	}


	public BinaryNode getRightChild() {
		return rightChild;
	}


	public void setRightChild(BinaryNode rightChild) {
		this.rightChild = rightChild;
	}


	public Comparable getElement() {
		return element;
	}


	public void setElement(Comparable el) {
		this.element = el;
	}


}
