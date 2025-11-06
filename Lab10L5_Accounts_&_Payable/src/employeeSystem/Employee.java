/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/17/2023
 * Purpose: To encapsulate information about an Employee (Lab10L5)
 */
package employeeSystem;

import java.text.NumberFormat;

/**Encapsulates information about an Employee including name and Employee ID
 */
public abstract class Employee {
	/**The Employee's first name*/
	protected String firstName;
	/**The Employee's last name*/
	protected String lastName;
	/**The Employee's ID*/
	protected String eid;
	/**Formats percentages*/
	protected static final NumberFormat PERC=NumberFormat.getPercentInstance();
	/**Formats money*/
	protected static final NumberFormat MONEY=NumberFormat.getCurrencyInstance();

	/**Creates a new Employee with input data
	 * @param firstName The Employee's first name
	 * @param lastName The Employee's last name
	 * @param eid The Employee's ID
	 */
	public Employee(String firstName, String lastName, String eid) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setEid(eid);
	}

	//Employee First Name
	/**Gets the first name of the Employee
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**Sets the first name of the Employee
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//Employee Last Name
	/**Gets the last name of the Employee
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**Sets the last name of the Employee
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//Employee ID
	/**Gets the ID of the Employee
	 * @return the eid
	 */
	public String getEid() {
		return eid;
	}

	/**Sets the ID of the Employee
	 * @param eid the eid to set
	 */
	public void setEid(String eid) {
		this.eid = eid;
	}

	/**Returns the earnings for this period for this Employee
	 * @return the earnings for this period for this Employee 
	 */
	public abstract double getEarnings();
	
	
	/**Return iff the data in o is equal to this Employee
	 * @param o the object to compare this Employee to
	 * @return true iff the data in o is equal to this Employee
	 */
	@Override
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}

	/**Returns a String version of this Employee
	 * @return a String version of this Employee
	 */
	@Override
	public String toString() {
		return "Employee: "+getFirstName()+" "+getLastName()+
				"\nEmployee ID: "+getEid();
	}

}
