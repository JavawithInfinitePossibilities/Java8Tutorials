/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.ThreadPoolImplementation.callcenterservices;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.IntStream;

/**
 * @author Lenovo
 *
 */
public class CallCenterManager {
	private BlockingQueue<Runnable> taskQueue = null;
	private List<CallCenterExecutive> workingExecutives = new ArrayList<CallCenterExecutive>();
	private boolean isStop = false;

	public CallCenterManager(int taskQueueValue, int workingExecutive) {
		super();
		this.taskQueue = new ArrayBlockingQueue<Runnable>(taskQueueValue);
		IntStream.range(0, workingExecutive).forEach((i) -> {
			workingExecutives.add(new CallCenterExecutive(taskQueue, "Executive-" + i));
		});
		workingExecutives.stream().forEach((worker) -> {
			worker.start();
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
		workingExecutives.stream().forEach((worker) -> {
			worker.stopThread();
		});
	}
}
