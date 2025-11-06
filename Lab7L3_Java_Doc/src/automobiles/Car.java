/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 10/11/2023
 * Purpose: To encapsulate information about a Car, including
 * the model, the miles driven, and the amount of gas used. (Lab7L3)
 */

package automobiles;

import java.text.DecimalFormat;

/**To encapsulate information about a Car, including
 * the model, the miles driven, and the amount of gas used so far.
 * @author dalger
 * 
 */
public class Car {

	/**The model of the Car*/
	private String model;
	/**The miles driven in the Car*/
	private int milesDriven;
	/**The gallons of gas used in the Car so far*/
	private double gallonsOfGas;
	/**The default format for printing out decimals in the Car*/
	private DecimalFormat decFormat = new DecimalFormat("0.0");

	/**Creates a Car about which we know nothing
	 * 
	 */
	public Car() {
		setModel("unknown");
	}

	/**Creates a Car with the input information
	 * 
	 * @param model The desired model of the Car
	 * @param milesDriven The desired number of miles driven in the Car
	 * @param gallonsOfGas The desired number of gallons of gas used by 
	 * this Car so far
	 */
	public Car(String model, int milesDriven, double gallonsOfGas) {
		setModel(model);
		setMilesDriven(milesDriven);
		setGallonsOfGas(gallonsOfGas);
	}

	/**Gets the model of the Car
	 * 
	 * @return The model of the Car
	 */
	public String getModel() {
		return model;
	}

	/**Sets the model of the car
	 * 
	 * @param model The desired model of the Car
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**Gets the miles driven in the Car
	 * 
	 * @return The miles driven in the Car
	 */
	public int getMilesDriven() {
		return milesDriven;
	}

	/**Sets the miles driven in the Car if the 
	 * input is > 0. Otherwise sets it to 0.
	 * 
	 * @param milesDriven The desired miles driven in the Car so far
	 */
	public void setMilesDriven(int milesDriven) {
		if (milesDriven > 0)
			this.milesDriven = milesDriven;
		else
			this.milesDriven = 0;
	}

	/**Gets the gallons of gas used by the Car so far
	 * 
	 * @return The gallons of gas used by the Car so far
	 */
	public double getGallonsOfGas() {
		return gallonsOfGas;
	}

	/**Sets the amount of Gas used by the Car so far if the input 
	 * is > 0. Otherwise, sets it to 0.
	 * 
	 * @param gallonsOfGas The desired amount of gas used by the Car so far
	 */
	public void setGallonsOfGas(double gallonsOfGas) {
		if (gallonsOfGas > 0)
			this.gallonsOfGas = gallonsOfGas;
		else
			this.gallonsOfGas = 0;
	}


	/**Gets the fuel efficiency of the Car if the gallons of gas 
	 * used is > 0.001. Otherwise returns 0
	 * 
	 * @return The fuel efficiency of the Car
	 */
	public double getMilesPerGallon() {
		if (getGallonsOfGas() > .001)
			return getMilesDriven()/getGallonsOfGas();
		return 0.0;
	}

	/**Gets the total money spent on gas for this car so far
	 * 
	 * @param pricePerGallon The price per gallon of gas
	 * @return The amount of money spent on gas so far
	 */
	public double getMoneySpentOnGas(double pricePerGallon) {
		return pricePerGallon*getGallonsOfGas();
	}

	/**Returns true iff the input Car has the same data as this car
	 * 
	 * @param o The Object to compare this Car to
	 * @return True iff the input Car has the same data as this Car 
	 */
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Car))
			return false;
		Car otherCar = (Car) o ;
		return otherCar.getModel().equals(getModel()) && otherCar.getMilesDriven() == getMilesDriven() &&
				otherCar.getGallonsOfGas() == getGallonsOfGas();
	}

	/**Returns a String version of this Car
	 * 
	 * @return A String version of this Car
	 */
	@Override
	public String toString() {
		return "Car:"+getModel()+"\n\tMiles Driven:"+getMilesDriven()+". Gas Used: "+getGallonsOfGas()+
				" Fuel Efficiency: "+decFormat.format(getMilesPerGallon())+" mpg.";
	}
}
