package com.bayviewglen.bst;

public class BinarySearchTree{

	private BinaryNode root = null;
	
	public BinaryNode getRoot(){
		
		return root;
		
	}
	
	public void insert(Comparable el, BinaryNode node){
		
		if (node == null){
			BinaryNode temp = new BinaryNode(el);
			if(el.compareTo(node.getElement()) <= 0){
				node.setLeftChild(temp);
			}else{
				node.setRightChild(temp);
			}
		}else if(el.compareTo(node.getElement()) <= 0){
			insert(el, node.getLeftChild());
		}else{
			insert(el, node.getRightChild());
		}
		
	}
	
	public boolean search(Comparable el, BinaryNode node){
		
		if(el.compareTo(node.getElement()) < 0){
			search(el, node.getLeftChild());
		}else if(el.compareTo(node.getElement()) > 0){
			search(el, node.getRightChild());
		}else if(el.compareTo(node.getElement()) == 0){
			return true;
		}else{
			return false;
		}
		return false;
	}
	
	public void inOrder(BinaryNode node){
		
		if(node == null)
			return;
		inOrder(node.getLeftChild());
		System.out.print(node.getElement() + ", ");
		inOrder(node.getRightChild());
	}
	
	public void postOrder(BinaryNode node){
		
		if(node == null)
			return;
		postOrder(node.getLeftChild());
		postOrder(node.getRightChild());
		System.out.print(node.getElement() + ", ");
		
	}
	
	public void preOrder(BinaryNode node){
		if(node == null)
			return;
		System.out.print(node.getElement() + ", ");
		preOrder(node.getLeftChild());
		preOrder(node.getRightChild());
	}
	
	public BinaryNode findMin(BinaryNode node){
		
		if(node.getLeftChild() == null){
			return node;
		}else{
			findMin(node.getLeftChild());
		}
		return node;
	}
	
	public void delete(Comparable el, BinaryNode node){
		
		if(node == null)
			return;
		if(el.compareTo(node.getElement()) > 0){//right
			delete(el, node.getRightChild());
		}else if(el.compareTo(node.getElement()) < 0){ //left
			delete(el, node.getLeftChild());
		}else{ //matches
			if(node.getLeftChild() != null && node.getRightChild() != null){
				
				BinaryNode temp = findMin(node.getRightChild());
				node.setElement(temp.getElement());
				delete(el,temp);
				
			}else if(node.getLeftChild() == null && node.getRightChild() != null){ //one child on the right.
				
				BinaryNode temp = node;
				temp = node.getRightChild();
				
			}else if(node.getRightChild() == null && node.getLeftChild() != null){ //one child on the left.
				
				BinaryNode temp = node;
				temp = node.getLeftChild();
				
			}else{
				node = null;
			}
		}
	}
}