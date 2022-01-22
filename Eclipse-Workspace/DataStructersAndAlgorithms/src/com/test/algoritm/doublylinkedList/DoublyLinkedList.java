package com.test.algoritm.doublylinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	public DoublyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	private class ListNode {

		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	public void printForwardDirection() {

		ListNode temp = head;

		while (temp != null) {

			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void printBackwardDirection() {

		ListNode temp = tail;

		while (temp != null) {

			System.out.print(temp.data + "->");
			temp = temp.previous;
		}
		System.out.print("null");
		System.out.println();
	}

	// Insert the values at begining of the linkedlist
	public void insertForwardDirection(int val) {
		ListNode newNode = new ListNode(val);

		if (isEmpty()) {
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		length++;
		newNode.next = head;
		head = newNode;
	}

	public void insertBackwardDirection(int val) {
		ListNode newNode = new ListNode(val);

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		length++;
		newNode.previous = tail;
		tail = newNode;
	}
	
	public ListNode deleteFirstNode() {		
		ListNode temp = head;
		if(isEmpty()) {
			throw new NoSuchElementException();
		}		
		if(head == tail) {
			tail = null;
		}else {
			head.next.previous = null;
		}
		
		head = head.next;
		temp.next = null;
		length --;
		return temp;
	}

	public ListNode deleteLastNode() {		
		ListNode temp = tail;
		if(isEmpty()) {
			throw new NoSuchElementException();
		}		
		if(head == tail) {
			head = null;
		}else {
			tail.previous.next = null;
		}
		
		tail = tail.previous;
		temp.previous = null;
		length --;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dl = new DoublyLinkedList();

		/*
		 * dl.insertForwardDirection(10); dl.insertForwardDirection(20);
		 * dl.insertForwardDirection(30); dl.insertForwardDirection(40);
		 */

		dl.insertBackwardDirection(10);
		dl.insertBackwardDirection(20);
		dl.insertBackwardDirection(30);
		dl.insertBackwardDirection(40);
		dl.insertBackwardDirection(50);
		
		/*
		 * ListNode deletedNode = dl.deleteFirstNode();
		 * System.out.println(deletedNode.data+" "+"has successfully deleted");
		 * deletedNode = dl.deleteFirstNode();
		 * System.out.println(deletedNode.data+" "+"has successfully deleted");
		 * deletedNode = dl.deleteFirstNode();
		 * System.out.println(deletedNode.data+" "+"has successfully deleted");
		 * deletedNode = dl.deleteFirstNode();
		 * System.out.println(deletedNode.data+" "+"has successfully deleted");
		 * deletedNode = dl.deleteFirstNode();
		 * System.out.println(deletedNode.data+" "+"has successfully deleted");
		 * deletedNode = dl.deleteFirstNode();
		 * System.out.println(deletedNode.data+" "+"has successfully deleted");
		 */
	     
			ListNode deletedNode = dl.deleteLastNode();
			System.out.println(deletedNode.data+" "+"has successfully deleted");
			 deletedNode = dl.deleteLastNode();
			System.out.println(deletedNode.data+" "+"has successfully deleted");
			 deletedNode = dl.deleteLastNode();
			System.out.println(deletedNode.data+" "+"has successfully deleted");
			 deletedNode = dl.deleteLastNode();
			System.out.println(deletedNode.data+" "+"has successfully deleted");
			 deletedNode = dl.deleteLastNode();
			System.out.println(deletedNode.data+" "+"has successfully deleted");
			 deletedNode = dl.deleteLastNode();
		     System.out.println(deletedNode.data+" "+"has successfully deleted");

		dl.printForwardDirection();
		dl.printBackwardDirection();
	}

}
