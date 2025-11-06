/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 9/10/2023
 * Purpose: To create a program that measures the length of, finds the initials of, 
 * prints out (both as is and in a random sequence of letters) first, middle, last, 
 * and full names in an array. (Program 1 Initials) 
 * Insight: The argument for the call Random.nextInt(_________); has to be broken into
 * two calls for the variables startIndex and endIndex. For startIndex the call has to be
 * random.nextInt(currentName.length()-4);. The reason the -4 is important is because
 * you're starting from the LAST index of the name (currentName.length() equals 15), 
 * you actually want to start at index 11. So to get to index 11, you subtract 4. If
 * you subtract 3, the program will not always cycle through all the names. If you 
 * subtract 5, your letters will only gather from the middle of the string (which 
 * defeats the purpose of a random letter generator). The call for endIndex has to 
 * be beginIndex+5; because the five indicates the number of characters you print. 
 * If you add 6, then you would print out 6 characters. If you add 4, you would print out 4 characters.
 */
package initials;

import java.util.Random;

public class Program1Initials {

	public static void main(String[] args) {
		//Create a new array of Strings named strings with the following line of code:
		String[] strings = {"David Lee Alger", "Kate Garry Hudson", "Tina Stamatina Fey", "Hugh Mungo Grant",
		"Uma Karuna Thurman"};
		
		//Create a for loop to step through the array with the following form 
		for (int i=0;i<strings.length;i++) {
			//The following goes in the loop:
			//Set a new String variable named currentName to "[David Lee Alger]" 
			//(Note that you ONLY need to use currentName for the rest of the program)
			String currentName = strings[i];
			
			int firstSpace = currentName.indexOf(' ');
			int lastSpace = currentName.lastIndexOf(' ');
			
			String firstName = currentName.substring(0,(firstSpace));
			int lengthOfFirstName = firstName.length();
			
			String middleName = currentName.substring((firstSpace+1),(lastSpace));
			int lengthOfMiddleName = middleName.length();
			
			
			String lastName = currentName.substring(lastSpace+1);
			int lengthOfLastName = lastName.length();
			
			
		
			//Output "Your first name is [David] with a length of [5]"
			System.out.println("Your first name is "+firstName+
					" with a length of "+lengthOfFirstName);
		
			//Output "Your middle name is [Lee] with a length of [3]"
			System.out.println("Your middle name is "+middleName+
					" with a length of "+lengthOfMiddleName);
		
			//Output "Your last name is [Alger] with a length of [5]"
			System.out.println("Your last name is "+lastName+
					" with a length of "+lengthOfLastName);
		
			//Output "Your initials are [DLA]. The length of your entire name is [15]"
			System.out.println("Your initials are "+firstName.charAt(0)+middleName.charAt(0)
				+lastName.charAt(0)+". The length of your entire name is "+currentName.length());	
			
			//Output "A random sequence of 5 letters in your name is "[d Lee A]""
			//Needs to be fixed (I'm not quite sure what to do with the random)
			Random random = new Random();
			
			int beginIndex = random.nextInt(currentName.length()-4);
			int endIndex = beginIndex+5;
			
			System.out.print("A random sequence of 5 letters in your name is: ");
			System.out.print("\""+currentName.substring(beginIndex,endIndex)+"\"");
		
			//Output two blank lines to separate the name being processed from the next name being processed
			System.out.println();
			System.out.println();
		}
	}
}
