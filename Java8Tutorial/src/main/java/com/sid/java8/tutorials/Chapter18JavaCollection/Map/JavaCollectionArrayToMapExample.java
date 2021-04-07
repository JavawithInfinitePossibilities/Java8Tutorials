/**
 * 
 */
package com.sid.java8.tutorials.Chapter18JavaCollection.Map;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class JavaCollectionArrayToMapExample {

	/**
	 * @param args <br/>
	 *             This is an example of iteration of array based on the index. <br/>
	 *             To keep the insertion order we are using LinkedHashMap.
	 */
	public static void main(String[] args) {
		String[] vehicles = { "ambulance", "helicopter", "lifeboat" };
		String[][] drivers = { { "User-1", "User-2", "User-3" }, { "User-4", "User-5", "User-6" },
				{ "User-7", "User-8", "User-9" } };
		Map<String, Set<String>> personal = new LinkedHashMap<String, Set<String>>();
		IntStream.range(0, vehicles.length).filter(i -> true).forEach(i -> {
			personal.put(vehicles[i], new LinkedHashSet<String>(Arrays.asList(drivers[i])));
		});
		System.out.println(personal);
	}

}
