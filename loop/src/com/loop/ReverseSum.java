package com.loop;

public class ReverseSum {

	public static void main(String[] args) {
		
		int Sum = 0;
		
		for (int i = 100; i>=0; --i) {
        Sum += i;
	}

	System.out.println(Sum);
    }
}