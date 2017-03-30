package com.bayviewglen.contactlist;

import java.io.PrintWriter;

import com.bayviewglen.bst.BinaryNode;

public class BinarySearchTree implements Directory {

	public Node root;

	public BinarySearchTree() {

		root = null;

	}

	// if no nodes.
	public void insert(Comparable data) {

		if (root == null) {
			root = new Node(data);
		} else {
			insert(root, data);
		}

	}

	// if there is nodes
	private void insert(Node node, Comparable data) {

		if(data.compareTo(node.element) <= 0){
			if(node.leftChild == null){
				node.leftChild = new Node(data);
			}else{
				insert(node.leftChild, data);
			}
		}else{
			if(node.rightChild == null){
				node.rightChild = new Node(data);
			}else{
				insert(node.rightChild, data);
			}
		}
	}

	//if only given data
	public Object search(Comparable data) {

		if (data == null)
			return null;
		return search(root, data);

	}

	// finds the node, given data.
	private Object search(Node node, Comparable data) {
		if (node == null)
			return null;
		if (node.element.compareTo(data) == 0){
			System.out.println("");
			System.out.println("The contact is present!");
			return node.element;
		}
		if(node.leftChild == null && node.rightChild == null){
			System.out.println("");
			System.out.println("Contact not in  the list!");
		}
		if (data.compareTo(node.element) < 0)
			return search(node.leftChild, data);
		return search(node.rightChild, data);
	
	}

	//if only given data find the key using search then delete.
	public Comparable delete(Comparable data) {

		Comparable temp;

		if (data == null)
			return null;

		temp = (Comparable) search(root, data);
		if (temp != null){
			root = delete(root, temp);
		System.out.println("");
		System.out.println("You have deleted the contact!");
		}
		return temp;

	}

	// removes node from a tree given data.
	private Node delete(Node node, Comparable data) {

		if (node == null)
			return null;
		if (node.element.compareTo(data) == 0) {
			if (node.leftChild == null && node.rightChild == null)
				return null;
			if (node.leftChild == null)
				return node.rightChild;
			if (node.rightChild == null)
				return node.leftChild;
			node.element = findMin(node.rightChild);
			node.rightChild = delete(node.leftChild,data);
			return node;
		}else if(data.compareTo(node.element) < 0){
			node.leftChild = delete(node.leftChild, data);
		}else{
			node.rightChild = delete(node.rightChild, data);
		}
		return node;
	}

	//for the smalles on the right tree.
	private Comparable findMin(Node node) {

		if (node.leftChild == null) 
			return node.element;
		return findMin(node.leftChild);
	}

	//inorder traversal.
	public void printAll(Node node) {
		int count = 1;
		if (node == null)
			return;
		printAll(node.leftChild);
		System.out.println(count + ": " + node.element);
		count++;
		printAll(node.rightChild);
	}

}