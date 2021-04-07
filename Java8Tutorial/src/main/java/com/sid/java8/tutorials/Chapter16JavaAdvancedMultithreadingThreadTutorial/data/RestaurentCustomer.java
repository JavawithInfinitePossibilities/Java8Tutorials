/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class RestaurentCustomer implements Runnable {

	private Restaurent restaurent;
	private int customerId;

	/**
	 * @param restaurent
	 * @param customerId
	 */
	public RestaurentCustomer(Restaurent restaurent, int customerId) {
		super();
		this.restaurent = restaurent;
		this.customerId = customerId;
	}

	@Override
	public void run() {

		try {
			restaurent.getTable(customerId);
			System.out.println("Customer #" + this.customerId + "  will eat for 10  seconds.");
			Thread.sleep(10000);
			System.out.println("Customer #" + this.customerId + "  is done  eating.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			restaurent.releaseTable(customerId);
		}
	}

}
