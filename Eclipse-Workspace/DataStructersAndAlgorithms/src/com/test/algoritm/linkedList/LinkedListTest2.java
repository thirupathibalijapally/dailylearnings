package com.test.algoritm.linkedList;

public class LinkedListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList();
		l.insertFirst(10);
		l.insertFirst(20);
		l.insertFirst(30);
		l.insertAtEnd(40);
		l.insertAtEnd(50);
		l.insertFirst(7);		
		l.display();
		
	boolean isFound =	l.searchBykey(11);	
	if(isFound) {
	System.out.println("The element is found in the linked list");
	}else {
		System.out.println("not found");
	}
		
	Node reverseNode = l.reverse();
	
	l.display(reverseNode);
	}
	
	

}
