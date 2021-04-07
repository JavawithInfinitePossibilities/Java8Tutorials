/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.concurrent.Semaphore;

/**
 * @author Lenovo
 *
 */
public class Restaurent {
	private Semaphore table;

	/**
	 * @param semaphore
	 */
	public Restaurent(int semaphoreLimit) {
		super();
		this.table = new Semaphore(semaphoreLimit);
	}

	public void getTable(int customerId) {
		try {
			System.out.println("Customer  #" + customerId + "  is trying  to  get  a  table.");
			this.table.acquire();
			System.out.println("Customer #" + customerId + "  got  a  table.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void releaseTable(int customerId) {
		System.out.println("Customer #" + customerId + "  returned a  table.");
		this.table.release();
	}
}
