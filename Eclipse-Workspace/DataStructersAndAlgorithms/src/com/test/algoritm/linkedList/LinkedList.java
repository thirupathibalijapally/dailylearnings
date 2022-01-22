package com.test.algoritm.linkedList;

public class LinkedList {

	Node head;
	
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
	}
	public void display( Node current) {
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null");
	}
	public int lenth() {		
		Node current = head;
		int count = 0;
		while (current != null) {
			count ++;
			current = current.next;
		}
		return count;
		
	}

	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;

	}
	
	@SuppressWarnings("null")
	public void insertAtEnd(int data) {
		Node node = new Node();		
		node.data= data;
		node.next = null;		
		if(head == null) {
			head = node;
			return;
		}			
	    Node current = head;		
		while(current.next != null) {			
			current= current.next;
		}		
		current.next = node;
	}
	
	public void insertAtPosition(int data,int position) {		
		Node node = new Node();		
		node.data = data;
		int count =1;		
		if (position == 1 ) {
			node.next = head;
			head = node;
		}else {
			Node previous = head;			
			while(count < position -1 ) {				
				previous = previous.next;
				count ++;
			}			
			Node current = previous.next;			
			 previous.next = node;
			 node.next = current;
		}
	}
	
	public Node deleteFirstNode() {
		if(head == null) {			
			return null;
		}		
		Node temp = head;		
		head = head.next;		
		temp.next = null;		
		return temp;
	}
	
	public Node deleteLastNode() {
		
		Node previous = null;
		
		Node current = head;
		
		if(head == null || head.next == null) {
			return head;
		}
		while(current.next != null) {
			previous = current;
			current = current.next;
			
		}
		previous.next= null;
		
		
		return current;
		
	}
	//delete the element based on the position
	public Node deleteNodeAtPosition(int position) {
		Node deleteNode = new Node();
		if(position == 1) {
			deleteNode = head;
			head = head.next;
		}else {
			
			Node previous = head;
			int count =1;
			
			while(count < position-1 ) {
				previous = previous.next;
				count ++;
			}
			
			Node current = previous.next;
			previous.next = current.next;
			deleteNode = current;
		}
		
		return deleteNode;
	}
	
	//search data with given searchkey	
	public boolean searchBykey(int searchKey) {		
		Node current = head;
	while(current != null) {
		if(current.data ==  searchKey) {
			return true;
		}
			current = current.next;		
	}
	return false;
	}
	
	
	
//reverse a linkedlist
	
public Node reverse() {
	
	Node current = head;	
	Node previous = null;
	Node next = null;
	while(current !=  null) {	
		
		next = current.next;		
		current.next = previous;		
		previous = current;		
		current = next;		
		
	}
return previous;
}
}