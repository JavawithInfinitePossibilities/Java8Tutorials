/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class ThreadClass1 extends Thread {

	private int id;

	/**
	 * @param id
	 */
	public ThreadClass1(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("This is the thread class extends thread class");
		try {
			System.out.println("This is the thread class extends thread class and the ID :" + id + " Started");
			Thread.sleep(5000);
			System.out.println("This is the thread class extends thread class and the ID :" + id + " Completed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
