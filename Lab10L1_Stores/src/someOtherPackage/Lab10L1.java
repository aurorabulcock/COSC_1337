/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/3/2023
 * Purpose: To test Store, WebStore, and MusicStore (Lab10L1)
 * Insight: They do have addToInventory because it was inherited 
 * from Store.
 */
package someOtherPackage;

import typesOfStores.MusicStore;
import typesOfStores.Store;
import typesOfStores.WebStore;

/**This tests Store, WebStore, and MusicStore
 * 
 */
public class Lab10L1 {

	/**This is the entry point of the program. Tests Store and its subclasses.
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		Store myShop = new Store("Dave's Awesome Store", 
				"1111 Main St., Tyler, TX, 75701");
		
		MusicStore myMusicShop = new MusicStore("Dave's Awesome Music Emporium",
				"1212 Main St., Tyler, TX, 75701", "Metallica");
		
		WebStore myWebStore = new WebStore("Dave's Webstore", "11313 Main St., Waynesboro, Virginia 22980",
				"www.davestore.com", "Java");
		
		//Add some inventory to the shops
		myShop.addToInventory("Rocks");
		myShop.addToInventory("Blocks");
		
		myMusicShop.addToInventory("Guitars");
		myWebStore.addToInventory("Black Lotus");
		
		//Print out the shops
		System.out.println(myShop);
		System.out.println(myMusicShop);
		System.out.println(myWebStore);

	}

}
