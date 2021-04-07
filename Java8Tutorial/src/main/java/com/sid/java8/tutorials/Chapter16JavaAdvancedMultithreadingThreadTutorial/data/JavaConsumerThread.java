/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class JavaConsumerThread implements Runnable {
	private ProducerConsumer producerConsumer;
	private ShutdownHook shutdownHook;

	/**
	 * @param producerConsumer
	 * @param shutdownHook
	 */
	public JavaConsumerThread(ProducerConsumer producerConsumer, ShutdownHook shutdownHook) {
		super();
		this.producerConsumer = producerConsumer;
		this.shutdownHook = shutdownHook;
	}

	@Override
	public void run() {
		while (shutdownHook.isFlag()) {
			synchronized (producerConsumer) {
				if (producerConsumer.getValue() != 0) {
					producerConsumer.consumer();
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
