package Sales;

import java.util.Scanner;

public class totalSale {

	public static void main(String[] args) {
		// Find Customer's Name and Number
		
		int num = 0;
		double salesAmount = 0.3;
		double totalAmountDue = 0.0;
		short taxCodeAmount = 0;
		
		
		
		Scanner scanner = new Scanner(System.in);
		String name;
		
		// Ask the user to input the customer's name
		
		do{
				System.out.println("Enter your name");
				name = scanner.nextLine();
				
				
		// Assign the customer a number
				
				System.out.println("Press 1 if your name starts with letter 'A' through 'J'."
						+ "Press 2 if your name starts with letter 'K' through 'T'. Press 0 if"
						+ "your name starts with 'U' through 'Z'.");
				name = scanner.nextLine();
		// Assign the the customer their tax code
					
					if (num > 0 && num != 0){
						System.out.println("Tax code:" + num);
					}
					else{
						System.out.println("Tax Exempt");
					}
		// Find the total amount due
					if (num == 0){
						System.out.println("Print Sales Amount" + salesAmount);
					}
					else{
						System.out.println("Print Sales Amount" + salesAmount * taxCodeAmount);
						break;
					}
					
		// Print out the customer's name, number, sales amount, sales tax and total amount due
					
									
					
		}while(totalAmountDue > 0); {
			System.out.println("Name:" + name);
			System.out.println("Number:" + num);
			System.out.println("Sales Amount:" + salesAmount);
			System.out.println("Sales Tax:" + taxCodeAmount);
			System.out.println("Total Amount Due:" + totalAmountDue);
		}
		
		
		
				
		}
}

		
			
		



