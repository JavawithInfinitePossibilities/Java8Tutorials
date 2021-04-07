/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.Account;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.Runner;

/**
 * @author Lenovo
 *
 */
public class JavaThreadDeadlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account();
		Runner runner = new Runner(acc1, acc2);
		Thread thread1 = new Thread(() -> {
			runner.firstThreadMethod();
		});

		Thread thread2 = new Thread(() -> {
			runner.secondThreadMethod();
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		runner.finished();
	}

}
