package com.test.algoritm.sort;

public class BubbleSort {

	public void bubbleSort(int arr[]) {
		
		boolean isSwapped;
		for(int i=0;i<arr.length-1;i++) {
			 isSwapped = false;
			for(int j=0;j<arr.length-1-i;j++) {				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];					
					arr[j]= arr[j+1];
					arr[j+1] = temp;
					isSwapped = true;
				}
				
			}
			if(isSwapped == false) {				
				break;
			}
		}
		for(int k=0;k<=arr.length-1;k++) {
			System.out.print(" "+arr[k]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {2,1,5,4,3,9,8,6,7};
    
    BubbleSort bb = new BubbleSort();
    bb.bubbleSort(arr);
	}

}
