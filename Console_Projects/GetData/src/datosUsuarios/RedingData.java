package datosUsuarios;

import java.util.Scanner;

public class RedingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Type anything");
		//Getting data from user
		String mydata = scan.nextLine();
		System.out.println("You Typed:  " + mydata );
		System.out.println("Would you like to convert your data to Uppercase or Lowercase");
		System.out.println("Please, Type yes or no");
		String userInput = scan.nextLine();
		// Creating two options 
		if(userInput.trim().toLowerCase().equals("yes") || userInput.trim().toLowerCase().equals("y") ) {
			System.out.println("Press 1 to conver to Uppercase or 2 to Convert to Lowercase");
			int userchoosing = scan.nextInt();
			switch (userchoosing) {
			case 1: {
				
				System.out.println("This is the new data obtained");
				System.out.println(mydata.toUpperCase());
				
				break;
			}
			case 2: {
				

				System.out.println("This is the new data obtained");
				System.out.println(mydata.toLowerCase());
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + userchoosing);
			}
			
		}
		else {
			System.out.println("You did not chose any correct answer");
		}
		
		
	}

}
