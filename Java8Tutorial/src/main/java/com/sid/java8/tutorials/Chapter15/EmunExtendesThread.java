/**
 * 
 */
package com.sid.java8.tutorials.Chapter15;

/**
 * @author Lenovo
 *
 */
public enum EmunExtendesThread implements Runnable {
	ONE("1");
	private String id;
	/**
	 * @param id
	 */
	private EmunExtendesThread(String id) {
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Emun class");
	}

}
