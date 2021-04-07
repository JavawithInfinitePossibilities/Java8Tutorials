/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class ProducerConsumer {

	private int value;

	/**
	 * @param value
	 */
	public ProducerConsumer(int value) {
		super();
		this.value = value;
	}

	public final int getValue() {
		return value;
	}

	public final void setValue(int value) {
		this.value = value;
	}

	public void producer(int value) {
		this.value = value;
		System.out.println("Producer produce :" + this.value);
	}

	public void consumer() {
		System.out.println("Consume the value :" + this.value);
		this.value = 0;
	}

}
