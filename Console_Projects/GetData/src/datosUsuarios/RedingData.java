package datosUsuarios;

import java.util.Scanner;

public class RedingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my program");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Type anything");
		String mydata = scan.nextLine();
		System.out.println("You Typed:  " + mydata );
		System.out.println("Would you like to convert your data to Uppercase or Lowercase");
		System.out.println("Please, Type yes or no");
		String userInput = scan.nextLine();
		
		if(userInput.trim().toLowerCase().equals("yes") || userInput.trim().toLowerCase().equals("y") ) {
			System.out.println("Press 1 to conver to Uppercase or 2 to Convert to Lowercase");
			
		}
		else {
			System.out.println("You did not chose any correct answer");
		}
		
		
	}

}
