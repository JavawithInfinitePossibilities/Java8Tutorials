/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaCountdownLatchMger;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaCountdownLatchWorker;

/**
 * @author Lenovo
 *
 */
public class JavaThreadCountdownLatches {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(5);
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executorService.execute(new JavaCountdownLatchWorker(countDownLatch, i));
		}
		/**
		 * executorService.shutdown(); If we use before the below line, <br/>
		 * then we are getting exception: <br/>
		 * java.util.concurrent.RejectedExecutionException: Task java.util.concurrent.FutureTask@19469ea2
		 */
		executorService.execute(new JavaCountdownLatchMger(countDownLatch, 5));
		executorService.shutdown();
		System.out.println("This is main thread...");

		try {
			countDownLatch.await();
			executorService.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread execution complete...");
	}

}
