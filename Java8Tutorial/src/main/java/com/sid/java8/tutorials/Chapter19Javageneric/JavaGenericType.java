/**
 * 
 */
package com.sid.java8.tutorials.Chapter19Javageneric;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sid.java8.tutorials.Chapter19Javageneric.data.CustomHashTable;
import com.sid.java8.tutorials.Chapter19Javageneric.data.DummyDataTable;
import com.sid.java8.tutorials.Chapter19Javageneric.data.JavaGenericMethod;
import com.sid.java8.tutorials.Chapter19Javageneric.data.SoftwareEngineer;
import com.sid.java8.tutorials.Chapter19Javageneric.data.Store;
import com.sid.java8.tutorials.Chapter19Javageneric.data.User;

/**
 * @author Lenovo
 *
 */
public class JavaGenericType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Store<Integer> store = new Store<Integer>();
		store.setItem(41);
		System.out.println(store.getItem());
		CustomHashTable<String, String> customHashTable = new CustomHashTable<String, String>("Sid", "Sahu");
		System.out.println(customHashTable);
		JavaGenericMethod genericMethod = new JavaGenericMethod();
		genericMethod.genericMethod("String");
		System.out.println(genericMethod.genericMethodWithReturnType(35.25));
		Object[] number = Arrays.stream(DummyDataTable.intArrayData()).boxed().collect(Collectors.toList()).toArray();
		genericMethod.genericMethodWithArray(number);
		User user = new User("Sid", "Sahu");
		user.setId(1);
		User user2 = new User("xyz", "abc");
		user2.setId(-2);
		User genericMethodWithBoundry = genericMethod.genericMethodWithBoundry(user, user2);
		System.out.println(genericMethodWithBoundry);
		SoftwareEngineer engineer = new SoftwareEngineer("Sidhanth", "Sahu", "asd", 25, true);
		engineer.setId(2);
		SoftwareEngineer engineer1 = new SoftwareEngineer("Susmita", "Sahoo", "asd", 25, true);
		engineer1.setId(1);
		User genericMethodWithBoundry2 = genericMethod.genericMethodWithBoundry(engineer, engineer1);
		System.out.println(genericMethodWithBoundry2);
		/**
		 * Arrays.asList(DummyDataTable.stringArrayData()) is immutable. <br/>
		 * If we do any operation then it will throw an exception java.lang.UnsupportedOperationException.
		 * <br/>
		 * On the other hand Collectors.toList() is mutable.
		 * 
		 */
		/*List<String> asList2 = Arrays.asList(DummyDataTable.stringArrayData());
		asList2.add("Welcome");
		*/
		List<String> asList = Arrays.asList(DummyDataTable.stringArrayData()).stream().collect(Collectors.toList());
		List<String> genericMethodWithBoundryCondition = genericMethod.genericMethodWithBoundryCondition("Welcome",
				asList);
		/*defining the type before the generic method is called Type Witness*/
		genericMethodWithBoundryCondition = genericMethod.<String>genericMethodWithBoundryCondition(" to my new state",
				asList);
		System.out.println(genericMethodWithBoundryCondition);
	}

}
