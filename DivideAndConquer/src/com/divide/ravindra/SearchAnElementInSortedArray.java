package com.divide.ravindra;

public class SearchAnElementInSortedArray {

	public static void main(String[] args) {
		int[] arr = {7,8,9,10,1,2,3,4,5,6};
		int index = searchElement(arr,7);
		
		System.out.println(index);
		
index = searchElement(arr,8);
		
		System.out.println(index);
		
index = searchElement(arr,9);
		
		System.out.println(index);
		
index = searchElement(arr,10);
		
		System.out.println(index);
		
index = searchElement(arr,1);
		
		System.out.println(index);
		
index = searchElement(arr,2);
		
		System.out.println(index);
		
index = searchElement(arr,3);
		
		System.out.println(index);
		
index = searchElement(arr,4);
		
		System.out.println(index);
		
index = searchElement(arr,5);
		
		System.out.println(index);
		
index = searchElement(arr,6);
		
		System.out.println(index);

	}

	
	public static int searchElement(int[] arr, int element){
		
		int l=0;int r= arr.length-1;
		
		while(l<=r){
			
			int mid = (l+r)/2;
			
			if(arr[mid]== element){
				return mid;
			}

			if(arr[mid] >= arr[l] && arr[mid] <= arr[r]){
				
				if(arr[mid] <element){
					l = mid+1;
				}else{
					r =mid-1;
				}
			}else{
				if(arr[mid] <element && arr[l]<=element){
					r = mid-1;
				}else if(arr[mid] <element && arr[l] >=element){
					l =mid+1;
				}else if(arr[mid] >element && arr[l] >=element){
					l= mid+1;
				}else if(arr[mid] >element && arr[l] <=element){
					r =mid-1;
				}
				
			}
		}
		
		return -1;
		
	}
}
