package com.test.algoritm.seach;

public class BinarySearch {

	public int searchIndex(int key,int arr[]) {
		
		int low = 0;
		int heigh = arr.length-1;
		
		while(low<=heigh) {
			int mid = (low +heigh)/2;
			
			if(arr[mid]== key) {
				return mid;
			}else if(key < arr[mid]) {
				heigh = mid-1;
			}else {
				low = mid+1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {10,20,30,40,50,60,70,80,90,100};
      BinarySearch bs = new BinarySearch();
      System.out.println(bs.searchIndex(10, arr));
	}

}
