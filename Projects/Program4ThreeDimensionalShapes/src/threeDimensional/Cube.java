/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/4/2023
 * Purpose: To encapsulate information about a Cube including the length of 
 * sides, surface area and volume (Program 4 Three Dimensional Shapes)
 */
package threeDimensional;

/**Encapsulates a cube including the length of sides, surface area
 * and volume
 */
public class Cube {
	//1 data member: an integer named lengthOfSide (this should be the ONLY data member)
	private int lengthOfSide;

	//2 constructors: a no-argument constructor that set lengthOfSide to 1 and 
	//one that takes lengthOfSide as an argument

	/**Creates a new Cube with a side length of 1
	 * 
	 */
	public Cube() {
		lengthOfSide = 1;
	}

	/**Creates a new Cube with the inputted side length
	 * 
	 * @param lengthOfSide The side length of the Cube
	 */
	public Cube(int lengthOfSide) {
		setLengthOfSide(lengthOfSide);
	}

	//A getter and a setter for lengthOfSide
	/**Gets the side length of the Cube
	 * @return the lengthOfSide
	 */
	public int getLengthOfSide() {
		return lengthOfSide;
	}

	/**Sets the side length of the Cube
	 * @param lengthOfSide the lengthOfSide to set
	 */
	public void setLengthOfSide(int lengthOfSide) {
		if (lengthOfSide>0)
			this.lengthOfSide = lengthOfSide;
	}

	//A toString() method for Cube that simply returns the string 
	//"Cube: [lengthOfSide] Surface Area: [surfaceArea] Volume: [volume]"
	/**Returns a String version of the Cube
	 * 
	 * @return a String version of the Cube
	 */
	@Override
	public String toString() {
		return "Cube: "+getLengthOfSide()+" Surface Area: "+getSurfaceArea()+" Volume: "+getVolume();
	}

	/**Gets the surface area of the Cube
	 * @return the surfaceArea
	 */
	//A getSurfaceArea() method that returns the surface area of this Cube.
	public int getSurfaceArea() {
		int surfaceArea=(int) (6*Math.pow(getLengthOfSide(),2));
		return surfaceArea;
	}

	/**Gets the volume of the Cube
	 * @return the volume
	 */
	//A getVolume() method that returns the volume of this Cube.
	public int getVolume() {
		int volume = (int) Math.pow(getLengthOfSide(), 3);
		return volume;
	}

	//An equals(Object o) method that returns true if and only if the Cube has identical 
	//lengthOfSide to this Cube.
	/**Returns true iff the Cubes have the same data
	 * 
	 * @param o The Object to compare this Cube to
	 * @return True iff the Cubes have the same data.
	 */
	@Override 
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}
}
