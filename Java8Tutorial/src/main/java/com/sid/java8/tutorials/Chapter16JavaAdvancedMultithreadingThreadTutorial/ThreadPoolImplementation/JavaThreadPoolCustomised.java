/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadPoolImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class JavaThreadPoolCustomised {

	private BlockingQueue<Runnable> taskQueue = null;
	private List<PoolThread> workingThread = new ArrayList<PoolThread>();
	private boolean isStop = false;

	/**
	 * 
	 */
	public JavaThreadPoolCustomised(int noOfThreads, int maxNoOfTask) {
		taskQueue = new ArrayBlockingQueue<Runnable>(maxNoOfTask);
		IntStream.range(0, noOfThreads).forEach((i) -> {
			workingThread.add(new PoolThread(taskQueue));
		});
		workingThread.stream().forEach((workerThread) -> {
			workerThread.start();
		});
	}

	public synchronized void execute(Runnable task) throws Exception {
		if (isStop) {
			System.exit(0);
		}
		try {
			this.taskQueue.add(task);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public synchronized void stop() {
		this.isStop = true;
		workingThread.stream().forEach((workerThread) -> {
			workerThread.stopThread();
		});
	}
}
