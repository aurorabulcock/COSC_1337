/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/25/2023
 * Purpose: To handle inventory for a bookstore (Lab9L2)
 * Insight: 
 * Question 1: for (int i=0;i<inventory.size();i++) {
			Book current = inventory.get(i);
			System.out.println(current);
		}
	Question 2: In any situation where you need the index 
	number as well - the enhanced for loop hides that as an extra detail
 */
package bookstore;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**A class for demonstrating how ArrayLists of Books will work
 * 
 */
public class Lab9L2 {

	/**The entry point for the program
	 * @param args NOT USED
	 * @throws FileNotFoundException if inventory.dat is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner to read the text file
		Scanner scanner = new Scanner(new File("inventory.dat"));

		//ArrayList to hold Books
		ArrayList<Book> inventory = new ArrayList<>();

		//Read from a file and create new Books
		while (scanner.hasNext()) {
			String title = scanner.nextLine();
			String author = scanner.nextLine();
			String priceString = scanner.nextLine();
			double price = Double.parseDouble(priceString);

			Book tempBook = new Book(title, author, price);
			inventory.add(tempBook);
		}
		scanner.close();

		//Change the price of the second Book
		Book temp = inventory.get(1);
		temp.setRetailPrice(0.00);

		//Enhanced for loop to print Books
		for (Book current:inventory)
			System.out.println(current);

		//Enhanced for loop to update the price of each Book
		for (Book current:inventory) {
			current.setRetailPrice(current.getRetailPrice()*1.1);
			System.out.println(current);
		}
	}

}
