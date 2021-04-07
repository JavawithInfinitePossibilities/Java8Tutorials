/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial;

import com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data.JavaStaticMethodSynchronisation;

/**
 * @author Lenovo
 *
 */
public class JavaStaticMethodSynchronisationUsingClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JavaStaticMethodSynchronisation javaStaticMethodSynchronisation = new JavaStaticMethodSynchronisation();

		Thread thread1 = new Thread(() -> {
			synchronized (JavaStaticMethodSynchronisation.class) {
				JavaStaticMethodSynchronisation.method1();
			}
		});

		Thread thread2 = new Thread(() -> {
			synchronized (javaStaticMethodSynchronisation) {
				JavaStaticMethodSynchronisation.method1();
			}
		});

		Thread thread3 = new Thread(() -> {
			synchronized (JavaStaticMethodSynchronisation.class) {
				JavaStaticMethodSynchronisation.method1();
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
	}

}
