package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * This is a test class for the AddingMachine class
 * by testing its methods and constructor
 * 
 * ID: 1213265207
 * Assignment 1
 * @author Albert De La Cruz
 *
 */
class AddingMachineTest {

	/**
	 * test if the constructor is working
	 */
	@Test
	void testAddingMachine() {
		AddingMachine tester = new AddingMachine();
	
		assertNotNull(tester);
	}
	
	/**
	 * test if the getter for total is working
	 */
	@Test
	void testGetTotal() {
		AddingMachine tester = new AddingMachine();
		
		assertTrue(tester.getTotal() == 0);
	}

	/**
	 * test if a value can be added to total
	 */
	@Test
	void testAdd() {
		AddingMachine tester = new AddingMachine();
		
		tester.add(5);//add 5 to total 0
		assertTrue(tester.getTotal() == 5);
	}

	/**
	 * test if subtract method is properly working
	 */
	@Test
	void testSubtract() {
		AddingMachine tester = new AddingMachine();
		
		tester.subtract(10);//subtract 10 from 0 to equal -10
		assertTrue(tester.getTotal() == -10);
	}

	@Test
	void testToString() {
		AddingMachine tester = new AddingMachine();
		
		tester.add(4);
		tester.subtract(2);
		tester.add(5);
		//should output 0 + 4 + 2 + 5
		String output = tester.toString();
		System.out.println(output);
		assertTrue(output.equals("0 + 4 - 2 + 5"));
		
	}

	/**
	 * test if clear method removes values in the object
	 */
	@Test
	void testClear() {
		AddingMachine tester = new AddingMachine();
		
		tester.add(24);
		tester.clear();//should set total to 0
		assertTrue(tester.getTotal() == 0);
	}

}
