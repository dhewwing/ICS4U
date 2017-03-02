package com.bayviewglen.contactlist;

import java.io.PrintWriter;

public class BinarySearchTree implements Directory {

	private Node root;

	public BinarySearchTree() {

		root = null;

	}

	public void insert(Comparable item) {

		if (root == null) {
			root = new Node(item);
		} else {
			insert(root, item);
		}

	}

	public void insert(Node node, Comparable item) {

		if (node.getElement().compareTo(item) >= 0) {
			if (node.getRightChild() == null) {
				Node temp = new Node(item);
				node.setRightChild(temp);
			} else {
				insert(node.getRightChild(), item);
			}
		} else {
			if (node.getLeftChild() == null) {
				Node temp = new Node(item);
				node.setLeftChild(temp);
			} else {
				insert(node.getLeftChild(), item);
			}
		}

	}

	public Object search(Node node, Comparable item) {
		if (node == null) {
			return null;
		} else if (node.getElement().compareTo(item) > 0) {
			search(node.getRightChild(), item);
		} else if (node.getElement().compareTo(item) < 0) {
			search(node.getLeftChild(), item);
		} 
		return node.getElement();
	}
	
	public Comparable delete(Comparable item){	

		Comparable temp;
		
		
		
	}

	public static void main(String[] args) {

	}
}