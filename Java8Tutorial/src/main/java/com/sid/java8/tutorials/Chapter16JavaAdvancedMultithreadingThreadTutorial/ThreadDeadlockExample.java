/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

/**
 * @author Lenovo
 *
 */
public class ThreadDeadlockExample implements Runnable {

	private Object obj1;	
	private Object obj2;

	/**
	 * @param obj1
	 * @param obj2
	 * @param latch
	 */
	public ThreadDeadlockExample(Object obj1, Object obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public void run() {
		System.out.println("Trying to get a lock on object 1");
		synchronized (obj1) {
			System.out.println("get a lock on object 1");
			System.out.println("Trying to get a lock on object 2");
			synchronized (obj2) {
				System.out.println("get a lock on object 1");
				System.out.println("Thread finished");
			}
		}
	}
}
