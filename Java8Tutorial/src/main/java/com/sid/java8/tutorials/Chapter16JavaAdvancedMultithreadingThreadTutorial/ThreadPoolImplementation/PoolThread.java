/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadPoolImplementation;

import java.util.concurrent.BlockingQueue;

/**
 * @author Lenovo
 *
 */
public class PoolThread extends Thread {

	private BlockingQueue<Runnable> taskQueue = null;
	private boolean isStop = false;

	public PoolThread(BlockingQueue<Runnable> taskQueue) {
		this.taskQueue = taskQueue;
	}

	@Override
	public void run() {
		while (!isStop) {
			try {
				Runnable taskRunnable = taskQueue.take();
				taskRunnable.run();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void stopThread() {
		isStop = true;
		this.interrupt();
	}

	public synchronized boolean isStopped() {
		return isStop;
	}
}
