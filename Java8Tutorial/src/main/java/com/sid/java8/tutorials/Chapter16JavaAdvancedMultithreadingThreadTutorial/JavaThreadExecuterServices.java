/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.ThreadClass1;

/**
 * @author Lenovo
 *
 */
public class JavaThreadExecuterServices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("This is main thread Started:");
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 10; i++) {
			executorService.submit(new ThreadClass1(i));
		}
		/**
		 * shutdown method will stop accepting more thread. <br/>
		 * But the executor Services will execute the thread which were submitted before the shutdown method
		 * call.
		 */
		executorService.shutdown();
		try {
			System.out.println("This is main thread Running:");
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is main thread Completed:");
	}

}
