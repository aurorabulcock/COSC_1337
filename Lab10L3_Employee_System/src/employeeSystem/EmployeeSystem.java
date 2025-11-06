/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/13/2023
 * Purpose: To test our EmployeeSystem (Lab10L3)
 */
package employeeSystem;

/**A class to test our Employees
 * 
 */
public class EmployeeSystem {

	/**The entry point of the program
	 * @param args NOT USED
	 */
	public static void main(String[] args) {
		//Create an object from each object class in the system and print
		Employee joe = new Employee("Joe", "Jones", "222-22222");
		System.out.println(joe+"\n");
		joe.setFirstName("Joesph");

		SalariedEmployee joan = new SalariedEmployee("Joan", "Joslin", "333-33333", 800.0);
		System.out.println(joan+"\n");
		joan.setLastName("Mallory");

		HourlyEmployee jan = new HourlyEmployee("Jan", "Johnson","444-44444", 15.75 );
		System.out.println(jan+"\n");
		jan.setEid("111-11111");

		System.out.println(joe+"\n");
		System.out.println(joan+"\n");
		System.out.println(jan+"\n");
	}

}
