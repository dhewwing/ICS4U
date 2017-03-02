package com.bayviewglen.contactlist;

public class Node {
	
	private Node leftChild;
	private Node rightChild;
	private Comparable element;
	
	
	public Node(Comparable el){
		element = el;
	}
	
	public Node getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}


	public Node getRightChild() {
		return rightChild;
	}


	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}


	public Comparable getElement() {
		return element;
	}


	public void setElement(Comparable el) {
		this.element = el;
	}


}
