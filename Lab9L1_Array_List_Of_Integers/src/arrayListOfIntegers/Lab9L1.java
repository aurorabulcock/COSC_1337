/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/20/2023
 * Purpose: To echo an ArrayList of Integers (Lab9L1)
 * Insight: It would read the String "Integers.dat"
 * that is: I n t e...
 */

package arrayListOfIntegers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**A class that echoes an ArrayList of Integers*/

public class Lab9L1 {

	/**The starting point of the program
	 * 
	 * @param args NOT USED
	 * @throws FileNotFoundException if Integers.dat is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> list = new ArrayList<>();
		File file = new File("Integers.dat");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext())
			list.add(scanner.nextInt());
		
		for (int i=0;i<list.size();i++) {
			int currentItem = list.get(i);
			System.out.print(currentItem+" ");		
		}
		
		System.out.println();;
		
		for(int i:list) 
			System.out.print(i+" ");
		
		System.out.println();
		System.out.println(list);
		
		scanner.close();

	}

}
