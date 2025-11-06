/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/15/2023
 * Purpose: To encapsulate information about a Passenger (Program 5 Trains)
 */
package trainsDemo;

/**Encapsulates information about a Passenger including
 * name and whether or not the Passenger is first class
 */
public class Passenger {
	//Fields
	/**The name of the passenger*/
	private String name = "";
	/**True iff the passenger is traveling in first class*/
	private boolean isFirstClass;

	/**Creates a new Passenger with input information
	 *@param name The Name of the Passenger
	 *@param isFirstClass is true if the Passenger is First Class
	 */
	public Passenger(String name, boolean isFirstClass) {
		setName(name);
		setFirstClass(isFirstClass);
	}

	/**Gets the name of the Passenger
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**Sets the name of the Passenger
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**Gets if the Passenger is First Class
	 * @return isFirstClass
	 */
	public boolean isFirstClass() {
		return isFirstClass;
	}

	/**Sets the Passenger to First Class iff they are First Class
	 * @param isFirstClass isFirstClass to set
	 */
	public void setFirstClass(boolean isFirstClass) {
		this.isFirstClass = isFirstClass;		
	}

	/**Returns true iff the two passengers are considered "equal"
	 * @param o The object to compare this passenger to
	 * @return true iff the two passengers to be considered "equal"
	 */
	@Override
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}

	/**Returns a string version of this passenger
	 * @return a String version of this passenger
	 */
	@Override
	public String toString() {
		return getName()+"\t\t"+(isFirstClass()?"!":"");
	}
}
