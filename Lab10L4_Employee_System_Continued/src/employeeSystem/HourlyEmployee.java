/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/13/2023
 * Purpose: To encapsulate information about an Hourly Employee (Lab10L4)
 */
package employeeSystem;

/**Encapsulates information about an Employee that is paid by the hour
 * 
 */
public class HourlyEmployee extends Employee {
	/**The Employee's hours this pay period*/
	protected double hours;
	/**The Employee's pay per hour*/
	protected double wage;

	/**Creates a new Hourly Employee based on incoming data
	 * @param firstName the first name of the Employee
	 * @param lastName the last name of the Employee
	 * @param eid the ID of the Employee
	 * @param wage the Employee's wage per hour
	 */
	public HourlyEmployee(String firstName, String lastName, String eid, double wage) {
		super(firstName, lastName, eid);
		setWage(wage);
		setHours(0);
	}

	/**Gets the hours of this Employee
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}

	/**Sets the hours of this Employee if hours>=0
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		if (hours>=0)
			this.hours = hours;
	}

	/**Gets the wage of this Employee
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/**Sets the wage of this Employee if wage>=0
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		if (wage>=0)
			this.wage = wage;
	}

	/**Returns the earnings for this period for this Employee
	 * @return the earnings for this period for this Employee 
	 */
	public double getEarnings() {
		return getWage()*getHours();
	}
	
	/**Returns a String version of this Hourly Employee
	 * @return a String version of this Hourly Employee
	 */
	@Override
	public String toString() {
		return "Hourly "+super.toString()+"\nWage: "+MONEY.format(getWage());
	}
}
