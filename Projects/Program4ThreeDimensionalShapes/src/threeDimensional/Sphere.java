/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/4/2023
 * Purpose: To encapsulate information about a Sphere including the radius, 
 * surface area and volume (Program 4 Three Dimensional Shapes)
 */
package threeDimensional;

/**Encapsulates a Sphere including the radius, surface area
 * and volume
 */
public class Sphere {
	//1 data member: an integer named radius (this should be the ONLY data member)
	private int radius;

	//2 constructors: a no-argument constructor that set lengthOfSide to 1 and 
	//one that takes lengthOfSide as an argument

	/**Creates a new Sphere with a radius of 1
	 * 
	 */
	public Sphere() {
		radius = 1;
	}

	/**Creates a new Sphere with the inputted radius
	 * 
	 * @param radius The radius of the Sphere
	 */
	public Sphere(int radius) {
		setRadius(radius);
	}

	//A getter and a setter for radius
	/**Gets the radius of the Sphere
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**Sets the radius of the Sphere
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		if (radius>0)
			this.radius = radius;
	}

	//A toString() method for Sphere that simply returns the string 
	//"Sphere: [radius] Surface Area: [surfaceArea] Volume: [volume]"
	/**Returns a String version of the Sphere
	 * 
	 * @return a String version of the Sphere
	 */
	@Override
	public String toString() {
		return "Sphere: "+getRadius()+" Surface Area: "+getSurfaceArea()+" Volume: "+getVolume();
	}

	/**Gets the surface area of the Sphere
	 * @return the surfaceArea
	 */
	//A getSurfaceArea() method that returns the surface area of this Sphere.
	public double getSurfaceArea() {
		double surfaceArea=(4*Math.PI*Math.pow(getRadius(),2));
		return surfaceArea;
	}

	/**Gets the volume of the Sphere
	 * @return the volume
	 */
	//A getVolume() method that returns the volume of this Sphere.
	public double getVolume() {
		double volume = ((4/3.0)*Math.PI*Math.pow(getRadius(), 3));
		return volume;
	}

	//An equals(Object o) method that returns true if and only if the Sphere has identical 
	//radius to this Sphere.
	/**Returns true iff the Spheres have the same data
	 * 
	 * @param o The Object to compare this Sphere to
	 * @return True iff the Spheres have the same data.
	 */
	@Override 
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}
}
