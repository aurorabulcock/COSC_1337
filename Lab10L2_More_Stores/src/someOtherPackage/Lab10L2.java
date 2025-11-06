/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/6/2023
 * Purpose: To test the GroceryStore, MusicStore, Store, and WebStore classes
 * in a polymorphic way (Lab10L2)
 * Insight: 
 * Question 1) Because MusicStore, WebStore, and GroceryStore all have a "is a" 
 * relationship with Store.
 * Question 2) It always tries to call the method from the most specific class first. 
 * If it can't find it, it looks at the superclass. If it can't find it there, it will 
 * look at the next superclass, etc.
 */
package someOtherPackage;

import java.util.ArrayList;
import java.util.Scanner;

import typesOfStores.GroceryStore;
import typesOfStores.MusicStore;
import typesOfStores.Store;
import typesOfStores.WebStore;

/**Tests the GroceryStore, MusicStore, Store, and WebStore classes
 * in a polymorphic way
 * 
 */
public class Lab10L2 {

	/**The entry point of the program
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		ArrayList<Store> stores = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String switchCondition = "";
		Store temporaryStore = null;
		do {
			System.out.print("Please indicate whether to add a (M)usic,"+
					"(W)eb, (G)rocery Store, or you may e(x)it: ");
			switchCondition = scanner.nextLine();
			if (!switchCondition.equals("x") && 
					!switchCondition.equals("X")) {

				System.out.print("Please enter the name of the store: ");
				String name = scanner.nextLine();

				System.out.print("Please enter the address of the store"+
						" on one line: ");
				String address = scanner.nextLine();

				switch (switchCondition) {
				case "M":
				case "m":
					System.out.print("Please enter the name"+
							"of the visiting artist: ");
					String visitingArtist = scanner.nextLine();
					temporaryStore = new MusicStore(name, address, visitingArtist);
					break;

				case "W":
				case "w":
					System.out.print("Please enter the URL for the site: ");
					String url = scanner.nextLine();
					System.out.print("Please enter the programming language of the site: ");
					String programmingLanguage = scanner.nextLine();
					temporaryStore = new WebStore(name, address, url, programmingLanguage);
					break;

				case "G":
				case "g":
					System.out.print("Please enter the annual revenue of the store: ");
					double annualRevenue = scanner.nextDouble();
					System.out.print("Please enter \"true\" if the store is part of a national chain: ");
					boolean isChain = scanner.nextBoolean();
					scanner.nextLine();
					temporaryStore = new GroceryStore(name, address, annualRevenue, isChain);
					break;
				}//end of the switch
				stores.add(temporaryStore);
				
				for (Store store:stores)
					System.out.println(store);

			}//end of the if statement (x or X)

		}while (!switchCondition.equals("x") && 
				!switchCondition.equals("X"));


		scanner.close();

	}//end of main

}//end of class Lab10L2
