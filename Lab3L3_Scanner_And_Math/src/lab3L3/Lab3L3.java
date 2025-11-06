/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 9/8/2023
 * Purpose: To test Scanner and the Math class (Lab3L3)
 * Insight: The return type would be changed to a boolean and Character.toLowercase
 * would change to Character.isDigit.
 * */
package lab3L3;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lab3L3 {

	public static void main(String[] args) {
		//Create and use a Scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int myInteger = scanner.nextInt();
		System.out.print("Please enter a double: ");
		double myDouble = scanner.nextDouble();
		System.out.print("Please enter a Boolean: ");
		boolean myBoolean = scanner.nextBoolean();
		System.out.print("Please enter a character: ");
		char myCharacter = scanner.next().charAt(0);
		System.out.print("Please enter a string with NO spaces: ");
		String myStringWithNoSpaces = scanner.next();
		scanner.nextLine();
		System.out.print("Please enter a string with spaces: ");
		String myStringWithSpaces = scanner.nextLine();
		System.out.println();
		
		//Use the Math Class
		System.out.println("The square root of your integer is: "+
				Math.sqrt(myInteger));
		System.out.println("The square root of your double is: "+
				Math.sqrt(myDouble));
		if (myBoolean)
			System.out.println("The absolute value of your integer is: "+
					Math.abs(myInteger));
		else
			System.out.println("The absolute value of your double is: "+
					Math.abs(myDouble));
		if (myBoolean)
			System.out.println("Your integer to the power of "+
					"your double is "+Math.pow(myInteger,myDouble));
		else
			System.out.println("Your double to the power of "+
				"your integer is "+Math.pow(myDouble,myInteger));
		System.out.println("The minimum of your integer and your double is "+
				Math.min(myInteger, myDouble));
		System.out.println();
		
		//Echo The Strings
		System.out.println(myStringWithNoSpaces);
		System.out.println(myStringWithSpaces);
		System.out.println();
		
		//use NumberFormat
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		System.out.println("Your double, formatted as currency is: "
				+currencyFormatter.format(myDouble));
		System.out.println("Your double, formatted as a percentage is: "
				+NumberFormat.getPercentInstance().format(myDouble));
		
		//Call static method
		System.out.println("Result of convert on your character: "
				+convert(myCharacter));
		
		scanner.close();
	}
	
	//Methods
	public static char convert(char SomeCharacter) {
		return Character.toLowerCase(SomeCharacter);
	}
}
