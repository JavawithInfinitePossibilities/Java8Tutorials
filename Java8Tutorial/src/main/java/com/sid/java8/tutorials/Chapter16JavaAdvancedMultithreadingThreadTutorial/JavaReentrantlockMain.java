/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaReentrantLock;

/**
 * @author Lenovo
 *
 */
public class JavaReentrantlockMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaReentrantLock javaReentrantLock = new JavaReentrantLock();

		Thread thread1 = new Thread(() -> {
			javaReentrantLock.methodForFirstThread();
		});

		Thread thread2 = new Thread(() -> {
			javaReentrantLock.methodForSecondThread();
			;
		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		javaReentrantLock.print();
	}

}
