package com.divide.ravindra;

public class MergeSortDelete {
	
	 public static void main(String[] args)
	 {
		 int[] a = {5,4,3,2,1,0};
		 
		 mergesort(a,0,5);
	 }
	 
	 
	 public static void mergesort(int[] a, int start , int end){
		 
		 if(start<end){
		 	int mid = (start+end)/2;
		 	
		 	mergesort(a,start,mid);
		 	mergesort(a,mid+1,end);
		 	
		 	merge(a, start, mid, end);
		 }
		 	
		 	
	 }
	 
	 
	 public static void merge(int[] a, int l, int r, int m){
		 
		 
		 
		 
	 }

}
