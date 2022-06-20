package Puropose;

public class Fibonacchi {
	
	
	
	public static int fibonacci(int number){
		
		if (number ==0) {
			
			return 0;
		}
		
		
		if(number == 1 )
		{ 
		
			return 1;
		} 
		return fibonacci(number-1) + fibonacci(number -2);
	}
	

	public static void main(String[] args) {
		
	   for (int i =0; i<10; i++)
			System.out.println(fibonacci(i));
		
		
	}
	
}
	


