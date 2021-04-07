/**
 * 
 */
package com.sid.java8.tutorials.Chapter16JavaAdvancedMultithreadingThreadTutorial.data;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Lenovo
 *
 */
public class Runner {

	private Account acc1;
	private Account acc2;

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	/**
	 * @param acc1
	 * @param acc2
	 */
	public Runner(Account acc1, Account acc2) {
		super();
		this.acc1 = acc1;
		this.acc2 = acc2;
	}

	public void acquireLock(Lock lock1, Lock lock2) {
		while (true) {
			boolean firstlock = false;
			boolean secondLock = false;
			try {
				firstlock = lock1.tryLock();
				secondLock = lock2.tryLock();
			} finally {
				if (firstlock && secondLock) {
					return;
				}
				if (firstlock) {
					lock1.unlock();
				}
				if (secondLock) {
					lock2.unlock();
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void firstThreadMethod() {
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			/**
			 * When you want to make a deadlock.
			 * lock1.lock();
			 * lock2.lock();
			 */
			
			acquireLock(lock1, lock2);
			try {
				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}

		}
	}

	public void secondThreadMethod() {
		Random random = new Random();
		for (int i = 0; i < 1000; i++) {
			/**
			 * When you want to make a deadlock.
			 * lock2.lock();
			 * lock1.lock();
			 */
			acquireLock(lock2, lock1);
			try {
				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock2.unlock();
				lock1.unlock();

			}
		}
	}

	public void finished() {
		System.out.println("Account 1 balence :" + acc1.getAccountBalence());
		System.out.println("Account 2 balence :" + acc2.getAccountBalence());
		System.out.println("Total balence :" + (acc1.getAccountBalence() + acc2.getAccountBalence()));
	}
}
