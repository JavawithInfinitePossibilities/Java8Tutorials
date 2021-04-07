/**
 * 
 */
package com.sid.java8.tutorials.Chapter18JavaCollection.Queues;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Lenovo
 *
 */
public class JavaCollectionQueuesExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Integer> integers = new ArrayBlockingQueue<Integer>(5);
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		System.out.println(integers);
		/*try {
			integers.add(5);
		} catch (Exception e) {
			System.out.println("Adding to many number:");
		}*/
		/*If the queue is empty then remove method will throw an exception*/
		integers.remove();
		System.out.println(integers);
		/*If the queue is empty then poll method will not going to throw exception it will return null value*/
		integers.poll();
		System.out.println(integers);
	}

}
