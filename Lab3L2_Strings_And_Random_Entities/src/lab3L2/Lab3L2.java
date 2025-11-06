/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 9/1/2023
 * Purpose: To practice working with strings and random integers (Lab3L2)
 * Insight: The parentheses around the two variables caused them to be 
 * added before they are appended to the string. Without the parentheses,
 * the variables are added to the string one at a time.
 */
package lab3L2;

import java.util.Random;

public class Lab3L2 {

	public static void main(String[] args) {
		//create some Strings
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//You can type this as well: 
		//String alphabet = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String everyEvenLetter = "BDFHJLNPRTVXZ";
		String politeGreeting = new String("Hello, World! How are you?");
		String sentenceWithEveryLetter = 
				"The quick brown fox jumps over the lazy dog.";
		
		//using length()
		System.out.println("Alphabet: "+alphabet+" Length of alphabet: "
				+ ""+alphabet.length());
		
		//changing cases
		System.out.println("Changing cases:");
		System.out.println(everyEvenLetter.toUpperCase());
		System.out.println(politeGreeting.toLowerCase());
		System.out.println(politeGreeting);
		
		//charAT and indexOf
		System.out.println("Index of J: "+alphabet.indexOf('J'));
		System.out.println("Index of \"brown\": "+
				sentenceWithEveryLetter.indexOf("brown"));
		System.out.println("Index of \"JR\": "+
				alphabet.indexOf("JR"));
		System.out.println("Character at position 2: "+
				alphabet.charAt(2));
		
		//substrings
		int startIndex = 4, endIndex = startIndex+5;
		System.out.println("Sentence with every letter starting at "+ 
				"index 31: "+sentenceWithEveryLetter.substring(31));
		System.out.println("sentenceWithEveryLetter with indices "+
				"8 to 12: "+sentenceWithEveryLetter.substring(8,8+5)); //you can also put (8,13)
		String substring = sentenceWithEveryLetter.substring(startIndex,endIndex);
		System.out.println(substring);
		
		//random entities
		Random random = new Random();
		System.out.println("Random Boolean: "+random.nextBoolean());
		System.out.println("Random double: "+random.nextDouble());
		for (int i=0;i<10;i++)
			System.out.println("Generating a random int between "+
					"7 and 14: "+(random.nextInt(8)+7));	
		/* Can I use +random.nextInt(7, 14)); as well? The syntax that showed up in the autofill
		 * was random.nextInt(i,i), where the first i is the lower bound (7 in this case) and the 
		 * second is the upper bound (14 in this case). I tested it and it seemed to work no problem
		 * but I'm wondering if it's ok to use this syntax?*/
		 int random1 = random.nextInt(10);
		 int random2 = random.nextInt(10);
		 System.out.println("Random digits are "+random1+random2);
		 System.out.println("Random digits added are "+
				 (random1+random2));
		}
	}


