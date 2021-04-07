/**
 * 
 */
package com.sid.java8.tutorials.Chapter10TwoArgumentBiFunctionalInterfacesBiPredicateBiFunctionBiConsumer.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Lenovo
 *
 */
public class DummyDataTable {

	public static int[] intArrayData() {
		int[] intDataArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		return intDataArray;
	}

	public static String[] stringArrayData() {
		String[] stringDataArray = { "Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa",
				"Gujarat", "Haryana", "Himachal", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra",
				"Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu",
				"Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal" };
		return stringDataArray;
	}

	public static Map<String, String> stringMapData() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Andhra Pradesh", "Hyderabad (Proposed Capital Amaravati)");
		map.put("Arunachal Pradesh", "Itanagar");
		map.put("Assam", "Dispur");
		map.put("Bihar", "Patna");
		map.put("Chhattisgarh", "Raipur");
		map.put("Goa", "Panaji");
		map.put("Gujarat", "Gandhinagar");
		map.put("Haryana", "Chandigarh");
		map.put("Himachal Pradesh", "Shimla");
		map.put("Jharkhand", "Ranchi");
		map.put("Karnataka", "Bengaluru (formerly Bangalore)");
		map.put("Kerala", "Thiruvananthapuram");
		map.put("Madhya Pradesh", "Bhopal");
		map.put("Maharashtra", "Mumbai");
		map.put("Manipur", "Imphal");
		map.put("Meghalaya", "Shillong");
		map.put("Mizoram", "Aizawl");
		map.put("Nagaland", "Kohima");
		map.put("Odisha", "Bhubaneswar");
		map.put("Punjab", "Chandigarh");
		map.put("Rajasthan", "Jaipur");
		map.put("Sikkim", "Gangtok");
		map.put("Tamil Nadu", "Chennai");
		map.put("Telangana", "Hyderabad");
		map.put("Tripura", "Agartala");
		map.put("Uttar Pradesh", "Lucknow");
		map.put("Uttarakhand", "Dehradun (Winter)Gairsain (Summer)");
		map.put("West Bengal", "Kolkata");
		return map;
	}

	public static List<SoftwareEngineer> getSoftwareEngineer() {
		SoftwareEngineer[] list = { new SoftwareEngineer("Durga", 60, false), new SoftwareEngineer("Sunil", 25, true),
				new SoftwareEngineer("Sayan", 26, true), new SoftwareEngineer("Subbu", 28, false),
				new SoftwareEngineer("Ravi", 17, true) };
		return Arrays.asList(list);
	}

	public static List<Employee> getEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));
		list.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));
		list.add(new Employee("Mallika", "Manager", 20000, "Bangalore"));
		list.add(new Employee("Kareena", "Lead", 15000, "Hyderabad"));
		list.add(new Employee("Katrina", "Lead", 15000, "Bangalore"));
		list.add(new Employee("Anushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Kanushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Sowmya", "Developer", 10000, "Bangalore"));
		return list;
	}
}
