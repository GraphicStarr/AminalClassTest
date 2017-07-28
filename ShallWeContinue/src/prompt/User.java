
package prompt;

import javax.xml.ws.Response;

public class User {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		String response = null;
		response = scan.nextLine();
		
		// Prompt user "Would you like to continue?"
	
		
		do{
			System.out.println("Would you like to continue?");
			
		}
		
			while(response.equalsIignoreCase("Y")
	}		{
				
				//Get value of input
		if(response.equalsIignoreCase("Y")){
			
			System.out.println("Continue");
		}
		else {
			System.out.println("Quit");
		}
		if(response.equalsIignoreCase("N")){
			System.out.println("Quit");
		}
		if(response.equalsIignoreCase("Other")){
			System.out.println("Error Message");
		}
			
	}
}

