/**
 * 
 */
package com.sid.java8.tutorials.Chapter18JavaCollection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lenovo
 *
 */
public class JavaCollectionSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(1);
		integers.add(3);
		integers.add(4);
		integers.add(2);

		System.out.println("Set value: " + integers);
		/*
		 * Set doesn't support set method.
		 */

		Set<Integer> integers2 = new LinkedHashSet<Integer>();
		integers2.add(2);
		integers2.add(3);
		integers2.add(1);
		integers2.add(4);
		System.out.println("Set value: " + integers2);

		Set<Integer> integers3 = new TreeSet<Integer>();
		integers3.add(2);
		integers3.add(3);
		integers3.add(1);
		integers3.add(4);
		System.out.println("Set value: " + integers3);

		Set<String> name = new TreeSet<String>();
		//name.add(null);
		/**
		 * We can add a null value at beginning of the set but is we add any value after that we will get
		 * exception: java.lang.NullPointerException
		 */
		name.add("A");
		System.out.println(name);
	}

}
