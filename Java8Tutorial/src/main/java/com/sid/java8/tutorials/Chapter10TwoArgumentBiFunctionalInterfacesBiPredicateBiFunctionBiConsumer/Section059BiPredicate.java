/**
 * 
 */
package com.sid.java8.tutorials.Chapter10TwoArgumentBiFunctionalInterfacesBiPredicateBiFunctionBiConsumer;

import java.util.function.BiPredicate;

/**
 * @author Lenovo
 *
 */
public class Section059BiPredicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (Integer o1, Integer o2) -> {
			return (o1 + o2) % 2 == 0;
		};
		System.out.println(biPredicate.test(20, 10));
	}

}
