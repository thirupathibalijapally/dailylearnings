package com.test.algoritm.stack;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Stack<Character> stack = new Stack<Character>();
           
           String str = "master";
           
           char[] chars = str.toCharArray();
           
           for(int i=0;i<chars.length;i++) {
        	   stack.push(chars[i]);
           }
           
           for(int i=0;i<str.length();i++) {
        	   chars[i]=  (Character) stack.pop();
           }
           
           String reverse = new String(chars);
           
           System.out.println(reverse);
           
	}

}
