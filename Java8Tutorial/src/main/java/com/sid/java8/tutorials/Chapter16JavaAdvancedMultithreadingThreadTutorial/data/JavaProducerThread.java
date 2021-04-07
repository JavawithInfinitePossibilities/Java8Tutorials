/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.Random;

/**
 * @author Lenovo
 *
 */
public class JavaProducerThread implements Runnable {

	private ProducerConsumer producerConsumer;
	private ShutdownHook shutdownHook;

	/**
	 * @param producerConsumer
	 * @param shutdownHook
	 */
	public JavaProducerThread(ProducerConsumer producerConsumer, ShutdownHook shutdownHook) {
		super();
		this.producerConsumer = producerConsumer;
		this.shutdownHook = shutdownHook;
	}

	@Override
	public void run() {
		while (shutdownHook.isFlag()) {
			synchronized (producerConsumer) {
				if (producerConsumer.getValue() == 0) {
					Random random = new Random();
					producerConsumer.producer(random.nextInt(10));
					try {
						producerConsumer.notifyAll();
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					try {
						producerConsumer.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
