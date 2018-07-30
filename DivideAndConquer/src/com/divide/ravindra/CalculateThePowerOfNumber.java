package com.divide.ravindra;

public class CalculateThePowerOfNumber {

	public static void main(String[] args){
		
		System.out.println(powerOf(2,6));
	}
	
	
	public static int powerOf(int x, int n){
		
		if(n==0)
			return 1;
		
		int temp = powerOf(x, n/2);
		
		if(n%2==0)
			return temp*temp;
		
		else
			return x*temp*temp;
		
	}
}
