package com.divide.ravindra;

public class MajorityElement {

	public static void main(String[] args) {
			int[] a ={1,1,1,1,2,3,4};
			System.out.println(majorityElement(a));

	}
	
	
	public static int majorityElement(int[] a){
		
		int halfLength = (a.length)/2;
		int mid = (0+a.length-1)/2;
		int index =mid;
		if(a[mid] == a[mid-1]){
			index = findStartElementOfMid(a,0,mid-1,a[mid]);
		}else{
			index =mid;
		}
		if(a[index+halfLength] ==a[mid]){
			return a[mid];
		}
		return -1;
	}
	
	
	public static int findStartElementOfMid(int[]a , int l, int r, int element){
		
		int mid = 0;
		
		while(l<=r){
			mid = (l+r)/2;
			
			if(l==r && a[mid]== element){
				return mid;
			}else if(a[mid]==element && a[mid-1] !=a[mid]){
				return mid;
			}else if(a[mid]==element && a[mid-1] ==a[mid]){
				r=mid-1;
			}else if(a[mid] < element){
				l= mid+1;
			}	
		}
		return -1;
	}

}
