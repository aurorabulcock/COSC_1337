/*Aurora "Ro" Bulcock
 * COSC 1337 001
 * 11/17/2023
 * Purpose: To encapsulate information about a Commissioned Employee (Lab10L5)
 */
package employeeSystem;

/**Encapsulates information about an Employee that is paid by commission (how much they sell)
 * 
 */
public class CommissionedEmployee extends Employee {
	/**The amount that this employee has sold this period*/
	protected double grossSales;
	/**The percentage the Employee gets paid of the amount they sold*/
	protected double commissionRate;
	
	/**Creates a new Commissioned Employee from the input data
	 * @param firstName The first name of the Employee
	 * @param lastName The last name of the Employee
	 * @param eid The EID of the Employee
	 * @param grossSales The gross sales of the Employee
	 * @param commissionRate The Employee's commission rate
	 */
	public CommissionedEmployee(String firstName, String lastName, String eid, double commissionRate) {
		super(firstName, lastName, eid);
		setCommissionRate(commissionRate);
		setGrossSales(0);
	}

	/**Gets the gross sales of this Employee
	 * @return the grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	}

	/**Sets the gross sales of this Employee
	 * @param grossSales the grossSales to set
	 */
	public void setGrossSales(double grossSales) {
		this.grossSales = (grossSales>=0?grossSales:0);
	}

	/**Gets the commission rate of the Employee
	 * @return the commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**Sets the commission rate of the Employee
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = (commissionRate>=0 && commissionRate<=1.0?commissionRate:0);
	}
	
	/**Returns the earnings for this period for this Employee
	 * @return the earnings for this period for this Employee 
	 */
	public double getEarnings() {
		return getGrossSales()*getCommissionRate();
	}
	
	
	/**Returns a String version of this Commissioned Employee
	 * @return a String version of this Commissioned Employee
	 */
	@Override
	public String toString() {
		return "Commissioned "+super.toString()+"\nCommission Rate: "+PERC.format(getCommissionRate());
	}
	
	

}
