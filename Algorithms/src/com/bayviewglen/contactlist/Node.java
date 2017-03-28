package com.bayviewglen.contactlist;

public class Node {
	
	Node leftChild;
	Node rightChild;
	Comparable element;
	
	public Node(Comparable el){
		this(el,null,null);
	}
	public Node (Comparable el, Node l, Node r){
		element = el;
		leftChild = l;
		rightChild = r;
	}


	


}
