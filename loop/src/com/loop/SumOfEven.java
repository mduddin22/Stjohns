package com.loop;

public class SumOfEven {

	public static void main(String[] args) {
		// Sum of even number from 1 to 100.
		
		int sum = 0;
		
		for (int i = 2; i<=100; i+=2){
			sum +=i;
		}
	
		System.out.println(sum);
	}
}
