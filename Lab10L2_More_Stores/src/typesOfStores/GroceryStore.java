/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/3/2023
 * Purpose: To encapsulate the concept of a Grocery store (Lab10L2)
 */
package typesOfStores;

/**Encapsulates a grocery store. Inherits from Store.
 * 
 */
public class GroceryStore extends Store{
	/**The annual revenue this store brings in*/
	private double annualRevenue;
	/**Stores whether or not this store is part of a national chain*/
	private boolean isChain;

	/**Constructs a new GroceryStore from input data
	 * @param name The name of the store
	 * @param address The address of the store
	 * @param annualRevenue The annual revenue earned by the store
	 * @param isChain Returns true iff the store is part of a national chain
	 */
	public GroceryStore(String name, String address, 
			double annualRevenue, boolean isChain) {
		super(name, address);
		setAnnualRevenue(annualRevenue);
		setChain(isChain);
	}

	/**Gets the annual revenue for this store
	 * @return the annualRevenue
	 */
	public double getAnnualRevenue() {
		return annualRevenue;
	}

	/**Sets the annual revenue for this store
	 * @param annualRevenue the annualRevenue to set
	 */
	public void setAnnualRevenue(double annualRevenue) {
		this.annualRevenue = annualRevenue;
	}


	/**Returns true iff this store is part of a national chain
	 * @return the isChain
	 */
	public boolean isChain() {
		return isChain;
	}

	/**Sets whether or not this store is part of a national chain
	 * @param isChain the isChain to set
	 */
	public void setChain(boolean isChain) {
		this.isChain = isChain;
	}

	/**Returns a String version of the grocery store
	 * @return a String version of the Grocery store
	 */
	@Override
	public String toString() {
		return super.toString()+"\n\tAnnual Revenue: "+getAnnualRevenue()+
				"\n\tis"+ (isChain()?"":" not")+" part of a national chain.";
	}


}
