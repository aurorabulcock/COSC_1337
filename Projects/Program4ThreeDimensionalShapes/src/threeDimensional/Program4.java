/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/4/2023
 * Purpose: To test the functions of the Cube and Sphere classes
 * (Program 4 Three Dimensional Shapes)
 * Insight:
 */
package threeDimensional;

import java.util.Scanner;

/**A class for demonstrating how the Cube and Sphere classes work*/
public class Program4 {

	/**The entry point for the program
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		//Create a Scanner named scanner off of standard input.
		Scanner scanner = new Scanner(System.in);

		//Create a Cube named firstCube and use the default (no-argument) constructor to populate the reference
		Cube firstCube = new Cube();

		//Print out firstCube using its toString() method.
		System.out.println(firstCube);

		//Prompt the user with "Please enter the length of the side for secondCube: "
		System.out.print("Please enter the length of the side for secondCube: ");

		//Read in the next integer and use it to set the length of the side of secondCube. 
		//DO NOT USE A CONSTRUCTOR TO SET THE LENGTH OF THE SIDE.
		Cube secondCube = new Cube(scanner.nextInt());

		//Make new Cube named thirdCube with sides equal to 3. USE THE ARGUMENT CONSTRUCTOR TO DO THIS.
		Cube thirdCube = new Cube(3);

		//Make a new integer named accessorValue and have it store the getter value for firstCube.
		int accessorValue = firstCube.getLengthOfSide();

		//Output "First Cube side length: ", "Second Cube surface area: ", and "Third Cube volume: 
		//" along with their values (use accessorValue for First Cube)
		System.out.println("First Cube side length: "+accessorValue+
				"\nSecond Cube surface area: "+secondCube.getSurfaceArea()+
				"\nThird Cube volume: "+thirdCube.getVolume());

		//Output all three Cubes in order along with the labels "First Cube: ", "Second Cube: ", 
		//and "Third Cube: " in the appropriate places. Then print out a new line
		System.out.println("First Cube: "+firstCube+"\nSecond Cube: "+secondCube+
				"\nThird Cube: "+thirdCube);
		System.out.println();

		//Output whether firstCube is equal to secondCube, whether secondCube is equal to thirdCube, and 
		//whether firstCube is equal to thirdCube. These lines MUST make use of Cube's equals method.
		if (firstCube.equals(secondCube))
			System.out.println("The first and second cubes hold the same data.");
		else System.out.println("The first and second cubes do NOT hold the same data.");

		if (secondCube.equals(thirdCube))
			System.out.println("The second and third cubes hold the same data.");
		else System.out.println("The second and third cubes do NOT hold the same data.");

		if (firstCube.equals(thirdCube))
			System.out.println("The first and third cubes hold the same data.");
		else System.out.println("The first and third cubes do NOT hold the same data.");

		//Throwaway white space
		System.out.println();
		System.out.println();

		//Repeat steps 1-10 above for Spheres. All variable names, all prompts, and all outputs should make 
		//sense.
		//Create a Scanner named scanner off of standard input.

		//Create a sphere named firstSphere and use the default (no-argument) constructor to populate the reference
		Sphere firstSphere = new Sphere();

		//Print out firstCube using its toString() method.
		System.out.println(firstSphere);

		//Prompt the user with "Please enter the radius for secondSphere: "
		System.out.print("Please enter the radius for secondSphere: ");

		//Read in the next integer and use it to set the radius of secondCube. 
		//DO NOT USE A CONSTRUCTOR TO SET THE RADIUS.
		Sphere secondSphere = new Sphere(scanner.nextInt());

		//Make new Sphere named thirdSphere with radius equal to 3. USE THE ARGUMENT CONSTRUCTOR TO DO THIS.
		Sphere thirdSphere = new Sphere(3);

		//Make a new integer named accessorValue2 and have it store the getter value for firstSphere.
		int accessorValue2 = firstSphere.getRadius();

		//Output "First Sphere radius: ", "Second Sphere surface area: ", and "Third Sphere volume: 
		//" along with their values (use accessorValue for First Cube)
		System.out.println("First Sphere radius: "+accessorValue2+
				"\nSecond Sphere surface area: "+secondSphere.getSurfaceArea()+
				"\nThird Sphere volume: "+thirdSphere.getVolume());

		//Output all three Spheres in order along with the labels "First Sphere: ", "Second Sphere: ", 
		//and "Third Sphere: " in the appropriate places. Then print out a new line
		System.out.println("First Sphere: "+firstSphere+"\nSecond Sphere: "+secondSphere+
				"\nThird Sphere: "+thirdSphere);
		System.out.println();

		//Output whether firstSphere is equal to secondSphere, whether secondSphere is equal to thirdSphere, and 
		//whether firstSphere is equal to thirdSphere. These lines MUST make use of Sphere's equals method.
		if (firstSphere.equals(secondSphere))
			System.out.println("The first and second spheres hold the same data.");
		else System.out.println("The first and second spheres do NOT hold the same data.");

		if (secondSphere.equals(thirdSphere))
			System.out.println("The second and third spheres hold the same data.");
		else System.out.println("The second and third spheres do NOT hold the same data.");

		if (firstSphere.equals(thirdSphere))
			System.out.println("The first and third spheres hold the same data.");
		else System.out.println("The first and third spheres do NOT hold the same data.");

		scanner.close();


	}

}
