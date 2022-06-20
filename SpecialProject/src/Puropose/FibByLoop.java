package Puropose;

public class FibByLoop {

	public static void main(String[] args) {
	
		

				 int maxNumber = 15; 
				 int previousNumber = 0;
				 int nextNumber = 1;
				 
		 
			        for (int i = 0; i <= maxNumber; ++i) {
			        	
			        	if (i <15) {
			            
			        	 System.out.print(previousNumber+", ");}
			        	
			        	if (i== 15) {
				            
				        	 System.out.print(previousNumber+ ".");
				        	 }
				        	
			        		
			        	
			     
			            int sum = previousNumber + nextNumber;
			            previousNumber = nextNumber;
			            nextNumber = sum;
			            
			        }
			            
			        }
			}


