/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class JavaThreadWorkerMgmt implements Runnable {
	private Worker worker;
	private int threadId;
	private int threadSize;

	/**
	 * @param worker
	 * @param threadId
	 * @param threadSize
	 */
	public JavaThreadWorkerMgmt(Worker worker, int threadId, int threadSize) {
		super();
		this.worker = worker;
		this.threadId = threadId;
		this.threadSize = threadSize;
	}

	@Override
	public void run() {
		while (!worker.isCheck()) {
			synchronized (worker) {
				if (worker.getCondition() != threadId) {
					try {
						worker.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					worker.print("Thread-" + threadId);
					worker.increment();
					worker.notifyAll();
					if (threadId % threadSize == 0) {
						worker.setCondition(threadId / threadSize);
					} else {
						worker.setCondition(threadId + 1);
					}
				}
			}
		}
	}

}
