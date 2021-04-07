/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lenovo
 *
 */
public class JavaReentrantLock {

	private int count;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++) {
			count++;
		}
	}

	public void methodForFirstThread() {
		try {
			lock.lock();
			System.out.println("Waiting for the condition...");
			condition.await();
			System.out.println("Waiting is over now...");
			increment();

		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}

	}

	public void methodForSecondThread() {
		try {
			System.out.println("Going in sleep mode");
			Thread.sleep(5000);
			System.out.println("Weaking up!");
			lock.lock();
			System.out.println("Got the lock");
			System.out.println("Please press the Enter key");
			new Scanner(System.in).nextLine();
			increment();
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void print() {
		System.out.println("Count value:" + count);
	}
}
