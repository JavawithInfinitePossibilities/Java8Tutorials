/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

/**
 * @author Lenovo
 *
 */
public class JavaStaticMethodSynchronisation {

	public static void method1() {
		System.out.println("This is a Static method. Thread name is :" + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is the end of Static method");
	}

	public void method2() {
		System.out.println("This is a instance method. Thread name is :" + Thread.currentThread().getName());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is the end of instance method.");
	}
}
