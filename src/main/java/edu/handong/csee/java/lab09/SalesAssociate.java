package edu.handong.csee.java.lab09;

/**
 * SalesAssociate class containing constructor, set methods setName and setSales,
 * get methods getName and getSales which will be used in SalesReporter.java.
 * @author Admin
 *
 */
public class SalesAssociate { // declare class
	
	private String name; // declare name as private String
	private double sales; // declare sales as private double
	
	/**
	 * SalesAssociate constructor which will build the data for salesman's name and sales
	 */
	public void SalesAssociate() { // declare method
		this.name = null; // set employee's name as no value for now
		this.sales = 0; // set salesman's sales as 0 for now
	}
	
	/**
	 * setName method which sets the salesman's name as the name string received.
	 * @param name
	 */
	public void setName(String name) { // declare method
		this.name = name; // set the name of salesman to name string received
	}
	/**
	 * setSales method which sets the salesman's sales as the sales double received.
	 * @param sales
	 */
	public void setSales(double sales) { // declare method
		this.sales = sales; // set the sales of salesman to sales double received
	}
	/**
	 * getName method which returns the name string of the salesman
	 * @return
	 */
	public String getName() { // declare method
		return this.name; // return the salesman's name
	}
	/**
	 * getSales method which returns the sales double of the salesman
	 * @return
	 */
	public double getSales() { //declare method
		return this.sales; // return the salesman's sales
	}
}
