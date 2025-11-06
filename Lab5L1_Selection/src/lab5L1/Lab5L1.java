/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 9/18/2023
 * Purpose: To practice simple selection (Lab5L1) 
 * Insight: 
 * 		1) It doesn't change the output at all since the line
 * 		after the break ends the switch.
 * 		2) It is wise to include the default case as the final 
 * 		case because unlike cases, it deals with several different
 * 		inputs instead of just one.
 */
package lab5L1;

import java.util.Scanner;

public class Lab5L1 {

	public static void main(String[] args) {
		//establish some variables
		String userID = "correctID";
		String password = new String("correctPassword");
		
		//get input from user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your user ID and password, "+
				"separated by a space: ");	
		String userIDAttempt = scanner.next();
		String passwordAttempt = scanner.next();
		scanner.nextLine();
		
		//get the result of the login
		if (userID.equals(userIDAttempt)) {
			if (password.equals(passwordAttempt))
				System.out.println("Welcome!");
			else
				System.out.println("Incorrect Password");
		}
		else if (password.equals(passwordAttempt))
			System.out.println("Incorrect User ID");
		else
			System.out.println("Incorrect User ID and password");
		
		//use a switch
		System.out.print("Please enter 1, 6, or 7: ");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("You entered 1!");
		case 7:
			System.out.println("You entered 7!");
			break;
		default:
			System.out.println("You entered something other than 1, 6, or 7!");
			break;
		case 6:
			System.out.println("You entered 6!");
			break;
		}
		
		scanner.close();

	}

}
