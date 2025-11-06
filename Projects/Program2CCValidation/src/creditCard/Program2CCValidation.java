/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/4/2023
 * Purpose: To create and test a program that validates credit card information
 * using the Luhn Algorithm and assigns a random 4 digit pin for
 * valid credit card numbers (Program 2: Credit Card Validation) 
 * Insight: 
 */

package creditCard;

import java.util.Scanner;
import java.util.Random;

public class Program2CCValidation {

	public static void main(String[] args) {
		//set up a Scanner
		Scanner scanner = new Scanner(System.in);

		//set up a boolean named validCreditCard and set it to false       
		boolean validCreditCard = false;

		//loop while not a valid credit card  
		do {
			//prompt the user for a potential credit card number                     
			System.out.print("Please enter your credit card number: ");            

			//Get the credit card number as a String - store in potentialCCN (use scanner's nextLine)
			String potentialCCN = scanner.nextLine();

			//use Luhn to validate credit card using the following steps:

			//store the last digit AS AN INT for later use in lastDigit (probably requires Integer.parseInt(String)
			int lastDigit = Integer.parseInt(potentialCCN.substring(potentialCCN.length()-1));

			//TEST then comment out! - check the last digit - System.out.println(lastDigit);
			/*TEST:
			Please enter your credit card number: 4847185356239374
			Your randomly generated pin is: 4189*/
			System.out.println(lastDigit);

			//remove the last digit from potentialCCN and store in potentialCCN using String's substring
			potentialCCN = potentialCCN.substring(0,(potentialCCN.length()-1));


			//TEST then comment out! - check potentialCCN - System.out.println(potentialCCN);
			/*TEST
			Please enter your credit card number: 4847185356239374
			Your randomly generated pin is: 8580*/
			System.out.println(potentialCCN);


			//create reversedCCN as a empty String by:
			String reversedCCN = "";
			//reversing the digits using a for loop by adding characters to reversedCCN
			for (int i=potentialCCN.length()-1; i>=0;i--) {
				reversedCCN = reversedCCN + potentialCCN.charAt(i);
			}//end the reverse the string loop

			//TEST then comment out! - check reversedCCN - System.out.println(reversedCCN);
			/*TEST:
		 	Please enter your credit card number: 4847185356239374
			Your randomly generated pin is: 4724
			 */
			System.out.println(reversedCCN);


			//set boolean isOddDigit to false
			boolean isOddDigit = false;


			//set up an integer called current digit and set it to 0
			int currentDigit = 0;


			//create an integer named sum and set it to 0
			int sum = 0;


			//multiply the digits in odd positions by 2, then subtract 9 from any number higher than 9 using:

			//(for loop running 0 to less than length of reversed CCN)
			for (int i=0;i<reversedCCN.length();i++) {
				//set currentDigit equal to the integer version of the current character
				currentDigit = Integer.parseInt(""+potentialCCN.charAt(i));


				//Test then comment out! - currentDigit -System.out.print(currentDigit);
				/*TEST:
				Please enter your credit card number: 4847185356239374
				Your randomly generated pin is: 6702
				 */
				System.out.print(currentDigit);


				//toggle isOddDigit (like a light switch - if it is true, make it false. If it is false, make it true)
				isOddDigit=!isOddDigit;


				//if isOddDigit
				if (isOddDigit) {


					//multiply currentDigit by 2 and store in currentDigit
					currentDigit = currentDigit*2;


					//if currentDigit > 9, subtract 9 from currentDigit and store in currentDigit
					if (currentDigit>9)
						currentDigit = currentDigit-9;

					//TEST then comment out - Check currentDigit - System.out.println(currentDigit);
					/*TEST:
					Please enter your credit card number: 4847185356239374
					Your randomly generated pin is: 2890
					 */
					System.out.println(currentDigit);
				}//end if isOddDigit

				//System.out.print(currentDigit);
				System.out.println(currentDigit);
				//if (i>=reversedCCN.length()-1)
				if (i>=reversedCCN.length()-1) 
					//System.out.println();
					System.out.println();
				//else
				else
					//System.out.print(" + ");
					System.out.print(" + ");
				//end of segment

				// add currentDigit to sum and store in sum
				sum = currentDigit+sum;
			}//end the for loop that runs from 0 to less than the length of reversed CCN     

			//TEST and comment out -  System.out.println("sum:"+sum);
			/*TEST:
			Please enter your credit card number: 4847185356239374
			Your randomly generated pin is: 7553
			 */
			System.out.println("sum:"+sum);

			//if the last digit of sum + the last Digit ends in a zero, set validCreditCard to true
			if ((sum%10+lastDigit)%10==0) {
				validCreditCard=true;
			}//end if

			//if validCreditCard is false, output an appropriate message
			if (!validCreditCard) {
				System.out.println("This is not a valid credit card number.");
			}//end if


		} while (!validCreditCard); //end while that checks for valid credit card


		//issue a RANDOM PIN and print it out - no more help :)
		if (validCreditCard) {
			Random random = new Random();
			int pinNumber=random.nextInt(9999-1111+1)+1111;
			System.out.println("Your randomly generated pin is: "+pinNumber);

		}//end of if
		scanner.close();

	}//end of main


}//end of class


