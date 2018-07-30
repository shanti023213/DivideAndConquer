package com.divide.ravindra;

public class InversionsInArray {

	public static void main(String[] args) {
		int[] a = {7,5,1,3,4,6};
		System.out.println(totalInversions(a,0,a.length-1,0,0));
		System.out.println("***");

	}

	
	public static int totalInversions(int[] a, int start, int end, int left, int right){
		// right conditions if a is null || empty || only one value
		
		int totalInversions = 0;
		if(start<end){
			
			int mid = (start+end)/2;
			int leftInversions = totalInversions(a,start,mid,0,0);
			int rightInversions = totalInversions(a,mid+1,end,0,0);
			totalInversions = mergeInversions(a,start, mid,end,leftInversions,rightInversions);
		}
		return totalInversions;
	}
	
	
	
	public static int mergeInversions(int[]a , int start, int mid, int end, int leftInversions, int rightInversions){
		
		if(start==end)
			return 0;
		
		 int[] L1 = new int[mid-start+1];
		 int[] L2= new int[end-mid];
		 
		 for(int i=0;i<L1.length;i++){
			 L1[i] = a[start+i];
		 }
		 for(int i=0;i<L2.length;i++){
			 L2[i] = a[mid+i+1];
		 }
		 
		int i= 0;
		int j= 0;
		
		int totalInversions =leftInversions+rightInversions;
		while(i<L1.length && j<L2.length){
			
			if(L1[i] < L2[j]){
				a[start] =L1[i];
				start++;
				i++;
			}else{
				totalInversions +=L1.length-i;
				a[start] =L2[j];
				start++;
				j++;
			}
		}
		
		while(i<L1.length){
			a[start] =L1[i];
			start++;
			i++;
		}
		
		while(i<L2.length){
			a[start] =L1[j];
			start++;
			j++;
		}
		 
		 return totalInversions;
	}
}
