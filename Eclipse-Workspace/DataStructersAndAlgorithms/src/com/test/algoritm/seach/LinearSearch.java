package com.test.algoritm.seach;

public class LinearSearch {	
	private int  search(int[] arr, int length, int key) {
		// TODO Auto-generated method stub
		for(int i=0;i<length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int arr[]= {2,4,10,3,5,7,9,0,8};
		LinearSearch ls= new LinearSearch();
		System.out.println(ls.search(arr,arr.length,5));
		System.out.println(ls.search(arr,arr.length,7));
		System.out.println(ls.search(arr,arr.length,0));

	}

	

}
