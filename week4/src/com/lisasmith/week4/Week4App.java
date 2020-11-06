package com.lisasmith.week4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4App {

	public static void main(String[] args) {

		/*
		 * Requirement 1 -- Create an instance of an ArrayList of String
		 * 					called employeeNames
		 */
		List<String> employeeNames = new ArrayList<String>();

		
		/*
		 * Requirement 2 -- Create an instance of a HashSet of Integer called ids
		 */
		Set<Integer> ids = new HashSet<Integer>();

		
		
		/*
		 * Requirement 3 -- Create an instance of a HashMap of Integer, String 
		 * 					called employeeMap
		 */
		Map<Integer,String> employeeMap = new HashMap<Integer,String>();
	
		
		/*
		 * Requirement 4 -- Add at least five entries to the employeeNames and ids
		 * 					(make sure they each have the same number of entries)
		 */
		
		employeeNames.add("George Washington");
		employeeNames.add("John Adams");
		employeeNames.add("Thomas Jefferson");
		employeeNames.add("James Madison");
		employeeNames.add("James Monroe");
		employeeNames.add("John Adams");
		employeeNames.add("Andrew Jackson");
		employeeNames.add("Martin Van Buren");
		employeeNames.add("William Harrison");
		employeeNames.add("John Tyler");
	
		
		ids.add(101);
		ids.add(102);
		ids.add(103);
		ids.add(104);
		ids.add(105);
		ids.add(106);
		ids.add(107);
		ids.add(108);
		ids.add(109);
		ids.add(110);

	
		System.out.println("-----------------------------------");
		System.out.println("IntroToJava-Week4 Coding Assignment");
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println();
		
		System.out.println("Requirement 1, 2, & 4:");
		System.out.println("----------------------");
		System.out.println();

		System.out.println("Employee Names:" );
		System.out.println("--------------");
		for (String name : employeeNames) {
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("Ids:" );
		System.out.println("---");

		for (Integer id : ids) {
			System.out.println(id);
			
		}
		System.out.println();
		System.out.println();

		
		/*
		 * Requirement 5
		 * 
		 * Create a variable int i = 0; then iterate over ids 
		 * using an enhanced for loop.  Inside the enhanced for 
		 * loop use employeeMap.put() to add a new entry to the map.
		 * 
		 * The entry should consist of a key that is the id in the 
		 * enhanced loop's current iteration, and a value that is 
		 * the employeeName at position i of the employeeNames ArrayList. 
		 * Increment i so that each iteration grabs the next element 
		 * in the ArrayList. 
		 */
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id,employeeNames.get(i++));
		}
		
		
		
		/*
		 * Requirement 6 -- Once the employeeMap is fully populated, use another 
		 * enhanced for loop to iterate over the employeeMap.keySet(), and use
		 * the key for each current iteration to print to the console both the 
		 * current key and it's associated value in the map.
		 */

		System.out.println("Requirements 3, 5, & 6:");
		System.out.println("-----------------------");
		System.out.println();

		System.out.println("Employee Map Contents");
		System.out.println("---------------------");
		System.out.println("Key:  Value:");
		System.out.println("---   -----");
		Set<Integer> employeeKeys = employeeMap.keySet();
		for (Integer key : employeeKeys) {
			System.out.println(key + " : " + employeeMap.get(key));
		}
		System.out.println();

		
		/*
		 * Requirement 7 -- Create a StringBuilder called idsBuilder.
		 */
		
		StringBuilder idsBuilder = new StringBuilder();

		
		/*
		 * Requirement 8 -- Iterate over the ids HashSet and append
		 * 					each id, followed by a dash "-" to
		 * 					idsBuilder.
		 */
		
		for (Integer id : ids) {
			idsBuilder.append(id+"-");
		}

		/*
		 * Requirement 9 -- print the result of idsBuilder.toString() to the console.
		 */

		System.out.println("Requirements 7-9:");
		System.out.println("-----------------");
		System.out.println();

		System.out.println(idsBuilder.toString());
		System.out.println();
		System.out.println();

		
		/*
		 * Requirement 10 -- Create another StringBuilder called namesBuilder
		 */
		StringBuilder namesBuilder = new StringBuilder();

		
		/*
		 * Requirement 11 -- Iterate over the employeeNames ArrayList and
		 * 					 append each name, followed by a space " " to
		 * 					 the namesBuilder.
		 */
	
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
	
		
		/*
		 * Requirement 12 -- Print the result of namesBuilder.toString() to the console.
		 */
		System.out.println("Requirements 10-12:");
		System.out.println("-------------------");
		System.out.println();
		System.out.println(namesBuilder.toString());
		System.out.println();
		System.out.println();

		
		System.out.println("------------------------------------------");
		System.out.println("End of IntroToJava-Week4 Coding Assignment");
		System.out.println("------------------------------------------");
	}
	

}
 