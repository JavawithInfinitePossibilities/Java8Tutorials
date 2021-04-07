/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.Restaurent;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.RestaurentCustomer;

/**
 * @author Lenovo
 *
 */
public class JavaThreadSemaphoreExampleRestaurentCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Restaurent restaurent = new Restaurent(3);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		IntStream.range(0, 10).forEach((i) -> {
			executorService.execute(new RestaurentCustomer(restaurent, i));
		});
		executorService.shutdown();
		try {
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
