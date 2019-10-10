package cse360assign2;

/**
 * 
 * 
 * 
 * ID: 1213265207
 * Assignment 2 
 * @author Albert De La Cruz
 * 
 */
public class AddingMachine {
	
	//declaring private variables
	private int total;
	private String operations;//used for keeping track of operations
	
	
	/**
	 * Default constructor, sets total 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		operations = "0";

	}
	
	/**
	 * Getter for variable total
	 * @return total Returns the variable total
	 */
	public int getTotal () {
		return total; 
	}
	
	/**
	 * Adds the parameter value to the total internal variable
	 * @param value
	 */
	public void add (int value) {
		operations +=  " + " + value;//adds the + operation and the value
		total = total + value;
	}
	
	/**
	 * Subtracts the parameter value from the total variable
	 * @param value User inputed value to subtract from
	 */
	public void subtract (int value) {
		operations +=  " - " + value;//add the - operation and the value
		total = total - value;
	}
	
	/**
	 * outputs all of the transactions and operations done to the total variable
	 * as a string with + for add and - for subtract
	 * @returns outputString returns the total transactions and operations as a string
	 */
	public String toString () {
		return operations;
	}
	
	/**
	 * sets private variables to their default values
	 */
	public void clear() {
		operations = "";
		total = 0;
	}
}

