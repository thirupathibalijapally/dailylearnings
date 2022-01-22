package com.test.algoritm.linkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();

		l.insertFirst(10);
		l.insertFirst(20);
		l.insertFirst(30);
		l.insertAtEnd(40);
		l.insertAtEnd(50);
		l.insertFirst(7);
		l.insertAtPosition(60, 2);
		l.insertAtPosition(80, 5);
		l.display();
		System.out.println();
		System.out.println(l.lenth());
		Node n = l.deleteFirstNode();
		System.out.println("the item has deleted is" + n.data);
		l.display();
		System.out.println();
		System.out.println(l.lenth());
		Node n1 = l.deleteFirstNode();
		System.out.println("the item has deleted is" + n1.data);
		l.display();
		System.out.println();
		System.out.println(l.lenth());
		Node n2 = l.deleteLastNode();
		System.out.println("the item has deleted is" + n2.data);
		l.display();
		System.out.println();
		Node n3= l.deleteLastNode();
		System.out.println("the item has deleted is" + n3.data);
		l.display();
		System.out.println();
		System.out.println(l.lenth());
		
		Node n4 = l.deleteNodeAtPosition(3);
	 System.out.println("the item has deleted is" + n4.data);
		l.display();
		System.out.println();
		System.out.println(l.lenth());
		
	}

}
