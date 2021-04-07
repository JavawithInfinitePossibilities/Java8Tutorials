/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import java.util.Scanner;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaConsumerThread;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaProducerThread;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.ProducerConsumer;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.ShutdownHook;

/**
 * @author Lenovo
 *
 */
public class JavaProducerConsumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShutdownHook shutdownHook = new ShutdownHook(true);
		ProducerConsumer producerConsumer = new ProducerConsumer(0);
		Thread producerThread = new Thread(new JavaProducerThread(producerConsumer, shutdownHook));
		Thread consumerThread = new Thread(new JavaConsumerThread(producerConsumer, shutdownHook));

		producerThread.start();
		consumerThread.start();

		System.out.println("Please enter a key to stop");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		shutdownHook.setFlag(false);
	}

}
