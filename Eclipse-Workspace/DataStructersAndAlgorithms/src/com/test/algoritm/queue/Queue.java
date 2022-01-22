package com.test.algoritm.queue;

import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;
	public Queue() {
		length = 0;
		front = null;
		rear = null;
	}
	
	private class ListNode {		
		private ListNode next ;		
		private int data;		
		public ListNode(int data) {
			next = null;
			this.data = data;
		}
	}
	
	public void enQueue(int data) {		
		ListNode newNode = new ListNode(data);
		if(front == null) {
			front = newNode;
		}
		else {
			rear.next = newNode;
		}		
		rear = newNode;		
		length++;
		
	}
	
	public int dequeue() {
		
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is already empty");
		}
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length --;
		
		return result;
		
	}
	
	
	public void print() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		ListNode current = front;
		while(current != null) {
			System.out.print(current.data+"<-");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public int first() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return front.data;
	}
	
	public int last() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return rear.data;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		
		return length == 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Queue queue = new Queue();
            
            System.out.println("Before Adding the elements into queue"+queue.length());
            
            queue.enQueue(10);
            queue.enQueue(20);
            queue.enQueue(30);
            queue.enQueue(40);
            
            System.out.println("After Adding the elements into queue"+queue.length());
            
            queue.print();
            
            queue.dequeue();
            
           queue.print();

	}

}
