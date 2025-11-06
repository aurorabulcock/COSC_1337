/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/11/2023
 * Purpose: To encapsulate information about an Airplane, including
 * the model, the miles flown, and the amount of fuel used. (Lab7L3)
 * Insight: The classes could easily be combined since they both have 
 * only a model, miles traveled, and an amount of fuel used.
 */

package automobiles;

/**A class that encapsulates information about an Airplane including 
 * model, the miles flown, and the amount of fuel used. <hr> Some
 * stuff I want to say.
 * @author dalger
 * 
 */

public class Airplane {
	/**The model of the Airplane*/
	private String model;
	/**The miles flown by this Airplane*/
	private int milesFlown;
	/**The number of gallons of fuel this Airplane has used so far*/
	private double gallonsOfFuel;

	/**Creates a new Airplane with the input information
	 * 
	 * @param model The model of the Airplane
	 * @param milesFlown The miles flown by this Airplane
	 * @param gallonsOfFuel The number of gallons of fuel this Airplane has used so far
	 */
	public Airplane(String model, int milesFlown, double gallonsOfFuel) {
		setModel(model);
		setMilesFlown(milesFlown);
		setGallonsOfFuel(gallonsOfFuel);
	}

	/**Gets the model of the Airplane
	 * 
	 * @return The model of the Airplane
	 */
	public String getModel() {
		return model;
	}

	/**Set the model of the Airplane
	 * 
	 * @param model The new model of the Airplane
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**Gets miles flown by the Airplane
	 * 
	 * @return The miles flown by the Airplane
	 */
	public int getMilesFlown() {
		return milesFlown;
	}

	/**This sets the miles flown by the Airplane
	 * 
	 * @param milesFlown The new miles flown by the Airplane
	 */
	public void setMilesFlown(int milesFlown) {
		this.milesFlown = milesFlown;
	}

	/**Gets the gallons of fuel used by this Airplane so far
	 * 
	 * @return The gallons of fuel used by this Airplane so far
	 */
	public double getGallonsOfFuel() {
		return gallonsOfFuel;
	}

	/**Sets the gallons of fuel used by the Airplane so far
	 * 
	 * @param gallonsOfFuel The new gallons of fuel used by the Airplane so far
	 */
	public void setGallonsOfFuel(double gallonsOfFuel) {
		this.gallonsOfFuel = gallonsOfFuel;
	}

	//data manipulation method for airplane
	/**Gets the fuel efficiency of this Airplane. Note that if
	 * gallonsOfFuel<=.001, this method returns as 0. 
	 * 
	 * @return The number of miles per gallon for this Airplane 
	 */
	public double getMilesPerGallon() {
		if (getGallonsOfFuel() > .001)
			return getMilesFlown() / getGallonsOfFuel();
		else
			return 0.0;
	}

	/**Returns a String representation of this Airplane
	 * 
	 * @return The String representation of this Airplane
	 */
	@Override
	public String toString() {
		return "Airplane: "+getModel()+"\n\tMiles Flown: "+getMilesFlown()+". Fuel Used: "+getGallonsOfFuel()+
				" gallons.\n\tFuel efficiency: "+getMilesPerGallon()+ " mpg.";
	}

	/**Returns true if and only if the input Airplane has the same data
	 * as this Airplane
	 * 
	 * @param o The Object to compare this Airplane to
	 * @return True iff the two Airplanes have the same data
	 */
	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}
}
