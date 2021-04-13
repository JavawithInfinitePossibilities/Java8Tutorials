/**
 * 
 */
package com.sid.java8.tutorials.Chapter18JavaCollection.List;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class JavaCollectionLinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		doTimeing("LinkedList", list);
		System.out.println(list.size());
		/*This will add a new element in the given position. Rest of the element will be push back.*/
		list.add(1500, 12);
		System.out.println("Value at 1500th position: " + list.get(1500));
		System.out.println("After adding a element in 1500 the size :" + list.size());
		/**
		 * set method will update the index
		 */
		System.out.println("Value at 1499th position: " + list.get(1499));
		list.set(1499, 15);
		System.out.println("Value at 1499th position: " + list.get(1499));
	}

	private static void doTimeing(String string, List<Integer> list) {
		System.out.println("Type : " + string);
		long start = System.currentTimeMillis();
		/*This will add some value in the list*/
		for (int i = 0; i < 1E5; i++) {
			/* It will add at the end of the list */
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time take to add element:" + (end - start));
		start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			/* It will add at the end of the list */
			list.add(i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time take to add element:" + (end - start));
		start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			/* This will add at the beginning of the list */
			list.add(0, i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time take to add element:" + (end - start));
	}
}
