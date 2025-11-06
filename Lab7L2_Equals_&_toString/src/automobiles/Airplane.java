/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/6/2023
 * Purpose: To encapsulate information about an Airplane, including
 * the model, the miles flown, and the amount of fuel used. (Lab7L2)
 * Insight: Yes, because the Airplane uses the toString method and 
 * the toString method includes all of the data items.
 */
package automobiles;

public class Airplane {
	//Fields
	private String model;
	private int milesFlown;
	private double gallonsOfFuel;

	//Static Initializers - none


	//Constructors
	public Airplane(String model, int milesFlown, double gallonsOfFuel) {
		setModel(model);
		setMilesFlown(milesFlown);
		setGallonsOfFuel(gallonsOfFuel);
	}

	//Methods - getters, setters, and data manipulation


	//model Getter & Setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	//milesFlown Getter & Setter
	public int getMilesFlown() {
		return milesFlown;
	}

	public void setMilesFlown(int milesFlown) {
		this.milesFlown = milesFlown;
	}

	//gallonsOfFuel Getter & Setter
	public double getGallonsOfFuel() {
		return gallonsOfFuel;
	}

	public void setGallonsOfFuel(double gallonsOfFuel) {
		this.gallonsOfFuel = gallonsOfFuel;
	}

	//Methods - data manipulation
	public double getMilesPerGallon() {
		if (gallonsOfFuel>0.001)
			return getMilesFlown()/getGallonsOfFuel();
		return 0;
	}

	//Methods - overridden methods
	@Override
	public String toString() {
		return "Airplane: "+getModel()+"\n\tMiles Flown: "+getMilesFlown()+
				". Fuel Used: "+getGallonsOfFuel()+" gallons."+
				"\n\tFuel Efficiency: "+getMilesPerGallon()+ " mpg.";
	}
	@Override
	public boolean equals(Object o) {
		return o.toString().equals(toString());
	}


}
