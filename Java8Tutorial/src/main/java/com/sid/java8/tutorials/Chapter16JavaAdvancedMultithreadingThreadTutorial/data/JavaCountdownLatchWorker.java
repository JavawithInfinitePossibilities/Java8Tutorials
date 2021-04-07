/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.concurrent.CountDownLatch;

/**
 * @author Lenovo
 *
 */
public class JavaCountdownLatchWorker implements Runnable {

	private CountDownLatch countDownLatch;
	private int id;

	/**
	 * @param countDownLatch
	 * @param id
	 */
	public JavaCountdownLatchWorker(CountDownLatch countDownLatch, int id) {
		super();
		this.countDownLatch = countDownLatch;
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("This is countdown latch worker thread id :" + id);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		countDownLatch.countDown();
	}

}
