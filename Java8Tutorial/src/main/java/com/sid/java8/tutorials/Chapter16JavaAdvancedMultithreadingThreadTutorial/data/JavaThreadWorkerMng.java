/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class JavaThreadWorkerMng implements Runnable {

	private Worker worker;
	private int threadId;
	private int threadSize;
	private int condition;

	/**
	 * @param worker
	 * @param threadId
	 * @param threadSize
	 */
	public JavaThreadWorkerMng(Worker worker, int threadId, int threadSize) {
		super();
		this.worker = worker;
		if (threadId % threadSize == 0) {
			this.condition = 0;
		} else {
			this.condition = threadId;
		}
		this.threadId = threadId;
		this.threadSize = threadSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (worker) {
				if (worker.isCheck() && (worker.getCount() % threadSize == condition)) {
					worker.print("Thread-" + threadId);
					worker.increment();
					worker.notifyAll();
				} else if (!worker.isCheck() && (worker.getCount() % threadSize == condition)) {
					worker.print("Thread-" + threadId);
					worker.increment();
					worker.notifyAll();
				} else {
					try {
						worker.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if (worker.isCheck()) {
					break;
				}
			}
		}
	}
}
