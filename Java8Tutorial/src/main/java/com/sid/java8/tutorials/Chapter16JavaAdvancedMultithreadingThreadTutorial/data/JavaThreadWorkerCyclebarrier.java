/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author Lenovo
 *
 */
public class JavaThreadWorkerCyclebarrier implements Runnable {

	private int id;
	private CyclicBarrier barrier;

	/**
	 * @param id
	 * @param barrier
	 */
	public JavaThreadWorkerCyclebarrier(int id, CyclicBarrier barrier) {
		super();
		this.id = id;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			System.out.println("Thread #" + id + " is going to work for " + 10 + "  seconds");
			Thread.sleep(10000);
			System.out.println("Thread #" + id + " is waiting at the barrier.");
			this.barrier.await();
			System.out.println("Thread #" + id + " passed the barrier.");
		} catch (InterruptedException | BrokenBarrierException e) {
			System.out.println("Barrier is broken.");
			e.printStackTrace();
		}
		try { //This one is needed for the terminating the cyclicbarriear. Otherwise it will continueing search for thread.
			this.barrier.await(10, TimeUnit.MINUTES);
		} catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
			e.printStackTrace();
		}
	}

}
