package com.ArrayList;

public class TwoDimensional {

	public static void main(String[] args) {
	
		
		int [][] numbers = {{10,20,30},{40,50,60},{32,45,51} };
		
		for (int i=0; i<numbers.length; i++) {
			System.out.print("\n");
			
			for (int j=0; j<numbers.length;j++) {
				
				System.out.print(numbers[i][j] + " ");
			}
				
				
		}
			

	}

}
