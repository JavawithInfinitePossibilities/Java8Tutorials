/**
 * 
 */
package com.sid.java8.tutorials.Chapter06PredefinedFunctionalInterfacesPredicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.sid.java8.tutorials.Chapter06PredefinedFunctionalInterfacesPredicate.data.DummyDataTable;

/**
 * @author Lenovo
 *
 */
public class Section028PredefinedFunctionalInterfacesPredicatePart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Predicate<Integer> predicate = (Integer i) -> {
			if (i > 10) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(predicate.test(100));

		int[] data = DummyDataTable.intArrayData();
		IntPredicate intPredicate = (i) -> i > 10;
		Arrays.stream(data).filter(intPredicate).forEach(i -> {
			System.out.println(i);
		});

		String[] states = DummyDataTable.stringArrayData();
		Predicate<String> predicateForState = name -> name.charAt(0) == 'K';
		Arrays.stream(states).filter(predicateForState).forEach((String stateName) -> {
			System.out.println("State name : " + stateName);
		});

		/**
		 * check if the collection is empty or not
		 */
		Predicate<Collection> predicateCheckEmpty = p -> !p.isEmpty();
		Set<String> map = DummyDataTable.stringMapData().keySet();
		if (predicateCheckEmpty.test(map)) {
			System.out.println("set is not empty");
		}

	}

}
