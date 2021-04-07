/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaThreadWorkerCyclebarrier;

/**
 * @author Lenovo
 *
 */
public class JavaThreadCyclicBarrierExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("We are ready.");
		};
		CyclicBarrier barrier = new CyclicBarrier(2, runnable);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		IntStream.range(0, 5).forEach((i) -> {
			executorService.execute(new JavaThreadWorkerCyclebarrier(i, barrier));
		});
		executorService.shutdown();
		System.out.println("This is main thread...");
		try {
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread execution complete...");
		System.out.println("Cyclic barrier");
	}

}
