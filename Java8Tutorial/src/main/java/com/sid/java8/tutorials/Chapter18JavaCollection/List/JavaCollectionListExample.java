/**
 * 
 */
package com.sid.java8.tutorials.Chapter18JavaCollection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Lenovo
 *
 */
public class JavaCollectionListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>();
		/*
		 * If we use add method it will push the value. 
		 * But If we use set method it will update the current position.
		 */
		integers.add(1);
		integers.add(3);
		integers.add(4);
		integers.add(5);

		System.out.println("Value at 0th position: " + integers.get(0));
		System.out.println("List :" + integers);
		/* set method will update the index */
		integers.set(1, 2);
		System.out.println("List :" + integers);
		integers.add(2, 3);
		System.out.println("List :" + integers);
		/**
		 * We can't set a value to a list beyond the current size. <br/>
		 * Otherwise we will face an exception:"main" java.lang.IndexOutOfBoundsException: Index 5 out of
		 * bounds for length 4
		 * 
		 */
		/*integers.set(5, 5);
		System.out.println("List :" + integers);
		*/

		List<Integer> list = new ArrayList<Integer>();
		doTimeing("ArrayList", list);

		List<Integer> integers2 = new ArrayList<Integer>();
		integers2.add(1);
		integers2.add(3);
		integers2.add(4);
		integers2.add(5);
		/**
		 * If we create an array from the list then the array is of fixed length and can't add a new
		 * element.
		 */
		/*
		 * Object[] i1 =  integers2.toArray();
		 * i1[4] = 6;
		*/
		System.out.println("Before the remove from list using iterator:" + integers2);
		/**
		 * Iterator will support remove operation.
		 */
		Iterator<Integer> iterator = integers2.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			if (integer.equals(4)) {
				iterator.remove();
			}
		}
		System.out.println("After the remove from list using iterator :" + integers2);
		System.out.println(iterator);

		System.out.println("Before the Adding a list :" + integers2);
		integers2.addAll(2, integers);
		System.out.println("After the Adding a list :" + integers2);

		List<Integer> linkedList = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			linkedList.add(i);
		}
		System.out.println("Before the adding into linkedList using iterator:" + linkedList);
		ListIterator<Integer> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();
			if (integer % 2 == 0 && listIterator.nextIndex() != 0) {
				listIterator.add(integer ^ 2);
			} else if (integer % 2 == 1) {
				listIterator.set(integer << 1);
			}
		}
		System.out.println("Before the adding into linkedList using iterator:" + linkedList);
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
