package com.test.algoritm.stack;

import java.util.NoSuchElementException;

public class Stack<T> {

	private ListNode top;
	private int length;
	
	
	private class ListNode{
		private T val;
	    private ListNode next;
	    
	    
	    public ListNode(T val) {
	    	this.val = val;
	    }
	    
	}
	
	public Stack() {
		top = null;
		length = 0;
	}
	public boolean isEmpty() {
		
		return length == 0;
	}
	
	public int length() {
		return length;
	}
	
	public void push(T val) {
		ListNode node = new ListNode(val);
		node.next = top;
	    top = node;
	    length++;
		
	}
	
	public Object pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Object result = top.val;
			top = top.next;
			length--;
		return result;
	}
	
	public Object peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		return top.val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		
		System.out.println("length of the stack is "+stack.length());
		System.out.println("peek Element of the stack is "+stack.peek());
		
		stack.pop();
		
		System.out.println("length of the stack is "+stack.length());
		System.out.println("peek Element of the stack is "+stack.peek());

		
		
		
		
	}

}
