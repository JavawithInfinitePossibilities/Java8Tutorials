/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

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
		 * java.util.concurrent.RejectedExecutionException: Task
		 * java.util.concurrent.FutureTask@19469ea2
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

		/** Using Java-8 lambda expression **/
		CountDownLatch latch = new CountDownLatch(10);
		ExecutorService Service = Executors.newFixedThreadPool(5);
		IntStream.range(0, 10).forEach((i) -> {
			Service.execute(() -> {
				System.out.println("This is countdown latch worker thread id :" + i);
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Work is done for worker thread id :" + i);
				latch.countDown();
			});
		});
		Service.execute(() -> {
			System.out.println("This is countdown latch manager thread");
			try {
				latch.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		Service.shutdown();
		System.out.println("This is main thread...");
		try {
			latch.await();
			Service.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread execution complete...");
	}

}
