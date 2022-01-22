package com.test.algoritm.circularlinkedList;

public class CircularLinkedList {

	private ListNode last;
	private int length;
	
	private class ListNode{
		private ListNode next ;
		private int data;
		
		public ListNode(int data) {
			this.data = data;		
			}
	}
	
	public CircularLinkedList() {
		last = null;
		length=0;
	}
	
	public int length() {
		return length;
		
	}
	public boolean isEmpty() {
	return length == 0;
	}
	
	
	public void createCircularLinkedList() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(40);
		ListNode fifth = new ListNode(50);
		
		first.next=second;
		second.next = third;
		third.next = fourth;
		fourth.next= fifth;
		fifth.next = first;		
		last = fifth;
		
	}
	
	
	public void display() {
		if(last == null) {
			return;
		}
		ListNode first = last.next;
		while(first != last) {			
			System.out.print(first.data +"->");			
			first = first.next;
		}
		
		System.out.print(first.data);
	}
	
	public void insertFirst(int data) {
		
		ListNode temp = new ListNode(data);
		
		if(last == null) {
			last = temp;			
		}else {				
			temp.next = last.next;			
		}
		last.next = temp;
		length++;
	}
	
	public void insertLast(int data) {
		ListNode temp = new ListNode(data);
		if(last == null) {
			last = temp;
			last.next = last;
		}else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
	
	
	public ListNode deleteAtFirst() {
		ListNode first = last.next;
		ListNode temp = first.next;
		if(last.next == null) {
			return last;
		}else {		
			
			first.next = null;			
			last.next = temp;
			
		}
		return first;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl = new CircularLinkedList();
		
		//cl.createCircularLinkedList();
		
		cl.insertFirst(10);
		cl.insertFirst(20);
		
		cl.insertLast(30);
		cl.insertLast(40);
		cl.deleteAtFirst();
		cl.display();
		cl.deleteAtFirst();
		cl.display();
		cl.deleteAtFirst();
		cl.display();
		
	}

}
