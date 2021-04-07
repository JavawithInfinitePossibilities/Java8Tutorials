/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.ThreadClass1;
import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.ThreadClass3;

/**
 * @author Lenovo
 *
 */
public class JavaThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("This is a Runnable interface");
		};
		Thread thread = new Thread(runnable);
		thread.start();
		ThreadClass1 threadClass1 = new ThreadClass1(1);
		Thread thread2 = new Thread(threadClass1);
		thread2.start();
		Thread thread3 = new Thread(ThreadClass3::myRun);
		thread3.start();
	}
}
