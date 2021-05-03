/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadPoolImplementation.callcenterservices;

import java.util.concurrent.BlockingQueue;

/**
 * @author Lenovo
 *
 */
public class CallCenterExecutive extends Thread {
	private BlockingQueue<Runnable> taskQueue = null;
	private boolean isStop = false;
	private String executiveName;

	public CallCenterExecutive(BlockingQueue<Runnable> taskQueue, String executiveName) {
		this.taskQueue = taskQueue;
		this.executiveName = executiveName;
	}

	@Override
	public void run() {
		while (!isStop) {
			try {
				System.out.println(this.executiveName + " is ready to perform the task...");
				Runnable task = taskQueue.take();
				task.run();
			} catch (InterruptedException e) {
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
