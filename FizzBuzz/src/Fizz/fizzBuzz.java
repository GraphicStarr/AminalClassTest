package Fizz;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare variables
		
		
	     String fizzBuzz=null;
		
		
// Lets make a FizzBuzz loop


for (int counter=1; counter <=100; counter++) {
 
	if( counter % 3 == 0){                             	   // Multiples of 3 will have output of "Fizz"
	
		System.out.println("Fizz");
		
	}
	else if(counter % 5 == 0){                			   // Multiples of 5 will have output of "Buzz"
			
			System.out.println("Buzz");
			
	}
	else if( counter% 5 == 0 && counter % 3 == 0){                //Multiples of 5 and 3 will have output of "FizzBuzz"
			
			System.out.println("FizzBuzz");
			
	}
	else if( counter % 2 == 0){                              // Multiples of 2 will have output of "Copy"
		
			System.out.println("Copy");
	}
	else if( counter % 2 == 0 || counter % 3 == 0){				   // Multiples of 6 will have output of "CopyFizz"
			
			System.out.println("CopyFizz");
	}
	else if( counter % 10 == 0){
			
			System.out.println("Cat");
	}
	
	else{
			
			System.out.print(counter);
			}
			
			}
		}

}
	
	


	


