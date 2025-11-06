/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/27/2023
 * Purpose: To translate grades from numbers to letters (Lab9L3)
 * Insight: 
 * Question 1: numberGrades.get(i) is an integer. When the 
 * character\t is added to the integer, '\t' is transformed
 * into its unicode value and added as is the next character 
 * in the output.
 * Question 2:
 * int count =0;
		for (int grade:numberGrades)
			System.out.println(grade+"\t"+letterGrades.get(count++));
 */
package lab9L3;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**A class that transforms number grades to letter grades
 * using its main method
 */
public class Lab9L3 {

	/**The entry point of the program
	 * @param args NOT USED
	 * @throws FileNotFoundException If the file NumberGrades.txt
	 * cannot be found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> numberGrades = readIntegers("NumberGrades.txt");
		//System.out.println(numberGrades);
		ArrayList<Character> letterGrades = numberGradesToLetterGrades(numberGrades);
		//System.out.println(letterGrades);
		for (int i=0;i<letterGrades.size();i++)
			System.out.println(numberGrades.get(i)+"\t"+
					letterGrades.get(i));
	}

	/**Read in a list of integers from fileName and returns them as an ArrayList
	 * @param fileName The name of the file to read from
	 * @return The ArrayList of integers
	 * @throws FileNotFoundException If the file named fileName
	 * cannot be found
	 */
	public static ArrayList<Integer> readIntegers(String fileName) throws FileNotFoundException{
		ArrayList<Integer> input = new ArrayList<>();
		Scanner scanner = new Scanner(new File(fileName));
		while (scanner.hasNext())
			input.add(scanner.nextInt());
		scanner.close();
		return input;
	}
	
	/**Transforms a list of number grades to a list of equal size
	 * of letter grades
	 * @param numberGrades The list of number grades
	 * @return The list of letter grades
	 */
	public static ArrayList<Character> numberGradesToLetterGrades(ArrayList<Integer> numberGrades) {
		ArrayList<Character> letterGrades = new ArrayList<>();
		for (int numberGrade:numberGrades)
			letterGrades.add(getLetterGrade(numberGrade));
			return letterGrades;
	}
	/**Gets a single letter grade from a single number grade 
	 * using a ten point scale
	 * @param numberGrade The numeric grade from which to get a letter grade
	 * @return The letter grade ('A', 'B', 'C', 'D', 'F')
	 */
	public static Character getLetterGrade(int numberGrade) {
		if (numberGrade>=90) return 'A';
		if (numberGrade>=80) return 'B';
		if (numberGrade>=70) return 'C';
		if (numberGrade>=60) return 'D';
		return 'F';
	}
	
}
