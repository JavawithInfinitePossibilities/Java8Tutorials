/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
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

		Semaphore semaphore = new Semaphore(4);
		ExecutorService executorService2 = Executors.newFixedThreadPool(10);
		IntStream.range(0, 10).forEach((i) -> {
			executorService2.execute(getRunnable(semaphore));
		});
		executorService2.shutdown();
		try {
			executorService2.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static Runnable getRunnable(Semaphore semaphore) {
		return () -> {
			try {
				semaphore.acquire();
				System.out.println("Currently " + Thread.currentThread().getName() + " acquired the lock.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Currently " + Thread.currentThread().getName() + " released the lock.");
				semaphore.release();
			}
		};
	}

}
