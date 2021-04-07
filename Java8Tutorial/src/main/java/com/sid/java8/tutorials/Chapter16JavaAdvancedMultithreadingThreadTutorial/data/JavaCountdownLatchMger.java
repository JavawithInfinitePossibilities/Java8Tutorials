/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.concurrent.CountDownLatch;

/**
 * @author Lenovo
 *
 */
public class JavaCountdownLatchMger implements Runnable {
	private CountDownLatch countDownLatch;
	private int id;

	/**
	 * @param countDownLatch
	 * @param id
	 */
	public JavaCountdownLatchMger(CountDownLatch countDownLatch, int id) {
		super();
		this.countDownLatch = countDownLatch;
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("This is countdown latch manager thread id :" + id);
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
